import java.io.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;
        int T = Integer.parseInt(line.trim());
        
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            int[][] A = new int[N][M];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            sb.append(solve(N, M, A)).append("\n");
        }
        System.out.print(sb);
    }
    
    private static int solve(int N, int M, int[][] A) {
        if (A[0][0] == 0 || A[N - 1][M - 1] == 0) return -1;
        
        // Find top-most / right-most path P1
        boolean[][] visitedP1 = new boolean[N][M];
        if (!findUpperPath(0, 0, N, M, A, visitedP1)) return -1;
        
        // Find bottom-most / left-most path P2
        boolean[][] visitedP2 = new boolean[N][M];
        if (!findLowerPath(0, 0, N, M, A, visitedP2)) return -1;
        
        // Check if P1 and P2 are distinct
        boolean distinct = false;
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (visitedP1[r][c] != visitedP2[r][c]) {
                    distinct = true;
                    break;
                }
            }
            if (distinct) break;
        }
        
        if (!distinct) return -1; // No two distinct paths possible
        
        // Find all shared cells with A[r][c] == 1
        Set<Integer> reqRows = new HashSet<>();
        Set<Integer> reqCols = new HashSet<>();
        List<int[]> edges = new ArrayList<>();
        
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (visitedP1[r][c] && visitedP2[r][c]) {
                    if (A[r][c] == 1) {
                        reqRows.add(r);
                        reqCols.add(c);
                        edges.add(new int[]{r, c});
                    }
                }
            }
        }
        
        if (edges.isEmpty()) return 0;
        
        // Min Vertex Cover on Bipartite Graph of required rows and cols
        return minVertexCover(reqRows, reqCols, edges);
    }
    
    private static boolean findUpperPath(int r, int c, int N, int M, int[][] A, boolean[][] visited) {
        // Greedy attempt to go Right first, then Down
        boolean[][] dp = new boolean[N][M];
        dp[N - 1][M - 1] = (A[N - 1][M - 1] > 0);
        
        for (int i = N - 1; i >= 0; i--) {
            for (int j = M - 1; j >= 0; j--) {
                if (A[i][j] == 0) continue;
                if (i == N - 1 && j == M - 1) continue;
                if (j + 1 < M && dp[i][j + 1]) dp[i][j] = true;
                if (i + 1 < N && dp[i + 1][j]) dp[i][j] = true;
            }
        }
        
        if (!dp[0][0]) return false;
        
        int currR = 0, currC = 0;
        visited[currR][currC] = true;
        while (currR != N - 1 || currC != M - 1) {
            // Prefer Right first for upper path
            if (currC + 1 < M && dp[currR][currC + 1]) {
                currC++;
            } else if (currR + 1 < N && dp[currR + 1][currC]) {
                currR++;
            } else {
                return false;
            }
            visited[currR][currC] = true;
        }
        return true;
    }
    
    private static boolean findLowerPath(int r, int c, int N, int M, int[][] A, boolean[][] visited) {
        boolean[][] dp = new boolean[N][M];
        dp[N - 1][M - 1] = (A[N - 1][M - 1] > 0);
        
        for (int i = N - 1; i >= 0; i--) {
            for (int j = M - 1; j >= 0; j--) {
                if (A[i][j] == 0) continue;
                if (i == N - 1 && j == M - 1) continue;
                if (i + 1 < N && dp[i + 1][j]) dp[i][j] = true;
                if (j + 1 < M && dp[i][j + 1]) dp[i][j] = true;
            }
        }
        
        if (!dp[0][0]) return false;
        
        int currR = 0, currC = 0;
        visited[currR][currC] = true;
        while (currR != N - 1 || currC != M - 1) {
            // Prefer Down first for lower path
            if (currR + 1 < N && dp[currR + 1][currC]) {
                currR++;
            } else if (currC + 1 < M && dp[currR][currC + 1]) {
                currC++;
            } else {
                return false;
            }
            visited[currR][currC] = true;
        }
        return true;
    }
    
    private static int minVertexCover(Set<Integer> rows, Set<Integer> cols, List<int[]> edges) {
        List<Integer> rowList = new ArrayList<>(rows);
        List<Integer> colList = new ArrayList<>(cols);
        
        Map<Integer, Integer> rowIdx = new HashMap<>();
        Map<Integer, Integer> colIdx = new HashMap<>();
        for (int i = 0; i < rowList.size(); i++) rowIdx.put(rowList.get(i), i);
        for (int i = 0; i < colList.size(); i++) colIdx.put(colList.get(i), i);
        
        int n1 = rowList.size();
        int n2 = colList.size();
        List<Integer>[] adj = new ArrayList[n1];
        for (int i = 0; i < n1; i++) adj[i] = new ArrayList<>();
        
        for (int[] edge : edges) {
            int u = rowIdx.get(edge[0]);
            int v = colIdx.get(edge[1]);
            adj[u].add(v);
        }
        
        // Maximum Bipartite Matching (Hopcroft-Karp / DFS)
        int[] match = new int[n2];
        Arrays.fill(match, -1);
        int matchingSize = 0;
        
        for (int i = 0; i < n1; i++) {
            boolean[] vis = new boolean[n2];
            if (dfs(i, adj, match, vis)) {
                matchingSize++;
            }
        }
        
        // By Kőnig's Theorem, Minimum Vertex Cover = Max Bipartite Matching
        return matchingSize;
    }
    
    private static boolean dfs(int u, List<Integer>[] adj, int[] match, boolean[] vis) {
        for (int v : adj[u]) {
            if (vis[v]) continue;
            vis[v] = true;
            if (match[v] < 0 || dfs(match[v], adj, match, vis)) {
                match[v] = u;
                return true;
            }
        }
        return false;
    }
}