# SHUFFLEHD

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Shuffle (Hard)

 **This is the hard version of the problem. Here, the final permutation $Q$ can be any permutation.** 

For a permutation $P$ of the integers $[1, N]$ and an integer $K$, define $f(P, K)$ as the permutation formed at the end of the following process:

- For each $i = 1, 2, \ldots, N - K + 1$ (in this order), sort the subarray $P[i, i + K - 1]$.

For example, $f([3, 2, 1], 2) = [2, 1, 3]$. First $P[1, 2]$ gets sorted, so $P = [2, 3, 1]$ and then $P[2, 3]$ gets sorted, so $P = [2, 1, 3]$.

You are given integers $N$ and $K$, and a permutation $Q$.

Count the number of permutations $P$ such that $f(P, K) = Q$ modulo $998244353$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains $2$ integers - $N$ and $K$. The second line contains $N$ integers - $Q_1, Q_2, \ldots, Q_N$.
### Output Format

For each test case, output on a new line the number of permutations $P$ modulo $998244353$.

### Constraints
- $1 \le T \le 10^4$
- $2 \le K \le N \le 2 \cdot 10^5$
- $1 \le Q_i \le N$
- $Q_i \ne Q_j$ for all $i \ne j$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
6
3 2
1 2 3
3 3
1 2 3
5 3
1 2 3 4 5
3 2
2 1 3
3 2
3 2 1
5 3
3 2 1 4 5

```

```
4
6
54
2
0
6
```

### Explanation:

 **Test Case 1:**  The valid permutations $P$ are $[1, 2, 3]$, $[2, 1, 3]$, $[1, 3, 2]$ and $[3, 1, 2]$.

 **Test Case 4:**  The valid permutations $P$ are $[2, 3, 1]$ and $[3, 2, 1]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T16:27:52.515Z  

```java
import java.io.InputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.TreeSet;

public class Main {
    private static final int MOD = 998244353;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] Q = new int[N];
            for (int i = 0; i < N; i++) {
                Q[i] = sc.nextInt();
            }

            // 1. Verify that the last K-1 elements are strictly sorted
            boolean valid = true;
            for (int i = N - K + 1; i < N - 1; i++) {
                if (Q[i] > Q[i + 1]) {
                    valid = false;
                    break;
                }
            }

            if (!valid) {
                sb.append(0).append("\n");
                continue;
            }

            // 2. Process windows right-to-left to count choices and check feasibility
            TreeSet<Integer> window = new TreeSet<>();
            for (int i = N - K + 1; i < N; i++) {
                window.add(Q[i]);
            }

            long ans = 1;
            for (int i = N - K; i >= 0; i--) {
                window.add(Q[i]);

                // Count elements in the active window that are >= Q[i]
                int choices = window.tailSet(Q[i], true).size();
                
                // If Q[i] is greater than the smallest element in the window 
                // that was carried over, Q is unachievable
                if (window.first() < Q[i]) {
                    valid = false;
                    break;
                }

                ans = (ans * choices) % MOD;

                // Keep the window size at K-1 for the previous step
                if (window.size() == K) {
                    window.pollLast(); // Remove the largest element pushed right
                }
            }

            if (!valid) {
                sb.append(0).append("\n");
            } else {
                sb.append(ans).append("\n");
            }
        }

        System.out.print(sb);
    }

    // Fast I/O Scanner
    static class FastScanner {
        private final InputStream is = System.in;
        private final byte[] buffer = new byte[1024 * 64];
        private int head = 0;
        private int tail = 0;

        private int read() {
            if (head >= tail) {
                head = 0;
                try {
                    tail = is.read(buffer, 0, buffer.length);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (tail <= 0) return -1;
            }
            return buffer[head++];
        }

        public int nextInt() {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return -1;
                c = read();
            }
            int res = 0;
            while (c >= '0' && c <= '9') {
                res = res * 10 + c - '0';
                c = read();
            }
            return res;
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SHUFFLEHD)