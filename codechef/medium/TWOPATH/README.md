# TWOPATH

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Two Paths

You are given a grid with $N$ rows and $M$ columns. The cell in the $i$-th row from the top and $j$-th column from the left is denoted $(i, j)$, and has the integer $A_{i, j}$ written on it. Each $A_{i, j}$ is either $0, 1,$ or $2$.

A  *right-down path*  in this grid is a sequence of $N+M-1$ cells $(x_1, y_1), (x_2, y_2), \ldots, (x_{N+M-1}, y_{N+M-1})$ such that:

- $(x_1, y_1) = (1, 1)$
- $(x_{N+M-1}, y_{N+M-1}) = (N, M)$
- For each $1 \le i \lt N+M-1$, exactly one of the following two conditions holds: $x_{i+1} = x_{i}$ and $y_{i+1} = y_i + 1$, or $x_{i+1} = x_{i} + 1$ and $y_{i+1} = y_i$

The grid is called  *good*  if there exist  **two**  right-down paths such that:

- The paths are different, i.e. each path contains a cell not in the other; and
- For every cell $(i, j)$ in the grid, at most $A_{i, j}$ of the two paths contain this cell.

You would like to make the given grid  *good*.
So, you can do the following:

- Choose a row or a column of the grid, change every instance of $1$ in the chosen row/column to $2$.

Find the minimum number of moves needed to make the given grid  *good*.
If it's not possible to make the grid  *good*  no matter what, print $-1$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line of each test case contains two space-separated integers $N$ and $M$ — the grid dimensions. The next $N$ lines describe the grid. The $i$-th of these $N$ lines contains $M$ space-separated integers $A_{i, 1}, A_{i, 2}, \ldots, A_{i, M}$.
### Output Format

For each test case, output on a new line the minimum number of operations needed to make the grid  *good*, or $-1$ if it's impossible to do so.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq N, M \leq 2\cdot 10^5$
- $1 \le NM \le 2\cdot 10^5$
- $A_{i, j} \in \{0, 1, 2\}$
- The sum of $NM$ over all test cases won't exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
6
2 2
1 1
1 1
2 4
1 0 0 0
2 1 2 1
3 5
2 1 0 0 0
1 1 1 1 1
0 0 1 1 2
4 3
2 0 2
0 0 0
2 0 2
2 0 2
4 5
1 1 0 0 0
1 1 1 0 0
0 0 1 1 0
0 0 0 1 1
2 6
2 2 2 2 2 2
2 2 2 2 2 2

```

```
2
-1
1
-1
4
0

```

### Explanation:

 **Test case $1$:**  We have a $2\times 2$ grid. The only way to have two different paths from $(1, 1)$ to $(2, 2)$ is for us to use $(1, 1) \to (1, 2) \to (2, 2)$ and $(1, 1) \to (2, 1) \to (2, 2)$.
These paths can both be valid only if $A_{1, 1}$ and $A_{2, 2}$ are both $2$ (and the other cells are at least $1$, which they are).

We need to increment both $A_{1, 1}$ and $A_{2, 2}$, which requires two moves - it cannot be done in $1$.

 **Test case $2$:**  Since the cells $(1, 2), (1, 3), (1, 4)$ are not usable, only a single unique path can exist from $(1, 1)$ to $(2, 4)$, so the answer is $-1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T15:47:07.202Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/TWOPATH)