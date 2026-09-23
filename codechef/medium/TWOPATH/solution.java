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
        // Essential cells (1,1) and (N,M) are visited by BOTH paths, so they must have A >= 1
        if (A[0][0] == 0 || A[N - 1][M - 1] == 0) return -1;
        
        int INF = 1000000000;
        int maxStep = N + M - 2;
        
        // dp[r1][r2][hasSplit]:
        // r1 = row of upper path P1
        // r2 = row of lower path P2 (r1 <= r2)
        // hasSplit: 0 = paths have never split yet
        //           1 = paths are currently split OR have split at least once
        int[][][] dp = new int[N][N][2];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Arrays.fill(dp[i][j], INF);
            }
        }
        
        // Base case at step 0 (cell (0,0))
        // If (0,0) has A[0][0] == 1, both paths visit it, so it needs an operation
        dp[0][0][0] = (A[0][0] == 1) ? 1 : 0;
        
        for (int step = 0; step < maxStep; step++) {
            int[][][] nextDp = new int[N][N][2];
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
                    
                    for (int split = 0; split < 2; split++) {
                        if (dp[r1][r2][split] == INF) continue;
                        
                        // Path 1 moves: dr1 = 1 (down), dr1 = 0 (right)
                        for (int dr1 = 0; dr1 <= 1; dr1++) {
                            int nr1 = r1 + dr1;
                            int nc1 = c1 + (1 - dr1);
                            if (nr1 >= N || nc1 >= M || A[nr1][nc1] == 0) continue;
                            
                            // Path 2 moves: dr2 = 1 (down), dr2 = 0 (right)
                            for (int dr2 = 0; dr2 <= 1; dr2++) {
                                int nr2 = r2 + dr2;
                                int nc2 = c2 + (1 - dr2);
                                if (nr2 >= N || nc2 >= M || A[nr2][nc2] == 0) continue;
                                
                                // Keep Path 1 above or equal to Path 2
                                if (nr1 > nr2) continue;
                                
                                int nextSplit = split;
                                if (nr1 < nr2) nextSplit = 1; // Paths split here
                                
                                int cost = 0;
                                // If paths coincide at (nr1, nc1), A must be 2
                                if (nr1 == nr2) {
                                    if (A[nr1][nc1] == 1) {
                                        // If both paths arrive at same cell with A=1,
                                        // operation is needed unless we already accounted for row/col
                                        cost = 1;
                                    }
                                }
                                
                                nextDp[nr1][nr2][nextSplit] = Math.min(
                                    nextDp[nr1][nr2][nextSplit],
                                    dp[r1][r2][split] + cost
                                );
                            }
                        }
                    }
                }
            }
            dp = nextDp;
        }
        
        // Both paths end at (N-1, M-1) and must have split at least once (hasSplit == 1)
        int result = dp[N - 1][N - 1][1];
        return (result >= INF) ? -1 : result;
    }
}