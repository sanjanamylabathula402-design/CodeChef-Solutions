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
        // Early impossibility check for start and end
        if (A[0][0] == 0 || A[N - 1][M - 1] == 0) return -1;
        
        // DP state: dp[r1][r2] = min cost at current step d = (r1 + c1) = (r2 + c2)
        // where r1 is row of path 1, r2 is row of path 2 (with r1 <= r2)
        int INF = 1000000000;
        int maxStep = N + M - 2;
        
        // dp[r1][r2][hasSplit]
        // hasSplit: 0 = paths haven't split yet or have already merged
        //            1 = paths are currently split (p1 strictly above p2)
        //            2 = paths have split and merged back together
        int[][][] dp = new int[N][N][3];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Arrays.fill(dp[i][j], INF);
            }
        }
        
        // Base case at (0, 0)
        // Cost at (0,0) depends on whether A[0][0] needs upgrade
        int startCost = (A[0][0] == 1) ? 1 : 0;
        dp[0][0][0] = startCost;
        
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
                    
                    for (int state = 0; state < 3; state++) {
                        if (dp[r1][r2][state] == INF) continue;
                        
                        // Try 4 possible moves for (p1, p2): (Down/Right, Down/Right)
                        for (int dr1 = 0; dr1 <= 1; dr1++) {
                            int nr1 = r1 + dr1;
                            int nc1 = c1 + (1 - dr1);
                            if (nr1 >= N || nc1 >= M) continue;
                            if (A[nr1][nc1] == 0) continue;
                            
                            for (int dr2 = 0; dr2 <= 1; dr2++) {
                                int nr2 = r2 + dr2;
                                int nc2 = c2 + (1 - dr2);
                                if (nr2 >= N || nc2 >= M) continue;
                                if (A[nr2][nc2] == 0) continue;
                                
                                if (nr1 > nr2) continue; // Keep path 1 above/equal path 2
                                
                                int nextState = state;
                                if (state == 0) {
                                    if (nr1 < nr2) nextState = 1; // Split occurred
                                } else if (state == 1) {
                                    if (nr1 == nr2) nextState = 2; // Merged back
                                }
                                
                                int addedCost = 0;
                                if (nr1 == nr2) {
                                    // Shared cell needs A = 2
                                    if (A[nr1][nc1] == 1) addedCost = 1;
                                }
                                
                                nextDp[nr1][nr2][nextState] = Math.min(
                                    nextDp[nr1][nr2][nextState],
                                    dp[r1][r2][state] + addedCost
                                );
                            }
                        }
                    }
                }
            }
            dp = nextDp;
        }
        
        // Final result at (N-1, M-1) must have state 2 (must have split at least once)
        int ans = dp[N - 1][N - 1][2];
        return ans >= INF ? -1 : ans;
    }
}