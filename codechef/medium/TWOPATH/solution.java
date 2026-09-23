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
        
        // Rows/Columns upgrade sets
        boolean[] rowNeeded = new boolean[N];
        boolean[] colNeeded = new boolean[M];
        
        // Find if two paths can exist using DP
        int INF = 1000000000;
        int maxStep = N + M - 2;
        
        // dp[r1][r2][state]
        // state 0: together before split
        // state 1: split apart (p1 above p2, r1 <= r2)
        // state 2: merged together after split
        int[][][] dp = new int[N][N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Arrays.fill(dp[i][j], INF);
            }
        }
        
        dp[0][0][0] = 0;
        
        for (int step = 0; step < maxStep; step++) {
            int[][][] nextDp = new int[N][N][3];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    Arrays.fill(nextDp[i][j], INF);
                }
            }
            
            for (int r1 = 0; r1 < N; r1++) {
                int c1 = step - r1;
                if (c1 < 0 || c1 >= M) continue;
                
                for (int r2 = r1; r2 < N; r2++) {
                    int c2 = step - r2;
                    if (c2 < 0 || c2 >= M) continue;
                    
                    for (int st = 0; st < 3; st++) {
                        if (dp[r1][r2][st] == INF) continue;
                        
                        for (int dr1 = 0; dr1 <= 1; dr1++) {
                            int nr1 = r1 + dr1;
                            int nc1 = c1 + (1 - dr1);
                            if (nr1 >= N || nc1 >= M || A[nr1][nc1] == 0) continue;
                            
                            for (int dr2 = 0; dr2 <= 1; dr2++) {
                                int nr2 = r2 + dr2;
                                int nc2 = c2 + (1 - dr2);
                                if (nr2 >= N || nc2 >= M || A[nr2][nc2] == 0) continue;
                                
                                if (nr1 > nr2) continue; // Keep path 1 strictly above path 2
                                
                                int nst = st;
                                if (st == 0) {
                                    if (nr1 < nr2) nst = 1; // Split
                                } else if (st == 1) {
                                    if (nr1 == nr2) nst = 2; // Merge
                                }
                                
                                int addedCost = 0;
                                if (nr1 == nr2 && (st == 0 || nst == 2)) {
                                    if (A[nr1][nc1] == 1) {
                                        addedCost = 1;
                                    }
                                }
                                
                                nextDp[nr1][nr2][nst] = Math.min(
                                    nextDp[nr1][nr2][nst],
                                    dp[r1][r2][st] + addedCost
                                );
                            }
                        }
                    }
                }
            }
            dp = nextDp;
        }
        
        int minCost = dp[N - 1][N - 1][2];
        return minCost >= INF ? -1 : minCost;
    }
}