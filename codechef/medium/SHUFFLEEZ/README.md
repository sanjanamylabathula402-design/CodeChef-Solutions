# SHUFFLEEZ

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Shuffle (Easy)

 **This is the easy version of the problem. Here, the final permutation $Q$ is always the identity permutation.** 

For a permutation $P$ of the integers $[1, N]$ and an integer $K$, define $f(P, K)$ as the permutation formed at the end of the following process:

- For each $i = 1, 2, \ldots, N - K + 1$ (in this order), sort the subarray $P[i, i + K - 1]$.

For example, $f([3, 2, 1], 2) = [2, 1, 3]$. First $P[1, 2]$ gets sorted, so $P = [2, 3, 1]$ and then $P[2, 3]$ gets sorted, so $P = [2, 1, 3]$.

You are given integers $N$ and $K$, and a permutation $Q$. Here, $Q$ is always identity permutation, i.e. $Q_i = i$ for all $i$.

Count the number of permutations $P$ such that $f(P, K) = Q$ modulo $998244353$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains $2$ integers - $N$ and $K$. The second line contains $N$ integers - $Q_1, Q_2, \ldots, Q_N$.
### Output Format

For each test case, output on a new line the number of permutations $P$ modulo $998244353$.

### Constraints
- $1 \le T \le 10^4$
- $2 \le K \le N \le 2 \cdot 10^5$
- $Q_i = i$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
3
3 2
1 2 3
3 3
1 2 3
5 3
1 2 3 4 5

```

```
4
6
54
```

### Explanation:

 **Test Case 1:**  The valid permutations $P$ are $[1, 2, 3]$, $[2, 1, 3]$, $[1, 3, 2]$ and $[3, 1, 2]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T16:19:28.693Z  

```java
import java.io.*;

public class Main {
    static final int MOD = 998244353;

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            // Read Q (identity permutation, included to consume input)
            for (int i = 0; i < n; i++) {
                sc.nextInt();
            }

            // Calculate K^(N - K + 1) % MOD
            long ans = power(k, n - k + 1, MOD);

            // Multiply by (K - 1)! % MOD
            for (int i = 1; i <= k - 1; i++) {
                ans = (ans * i) % MOD;
            }

            out.println(ans);
        }

        out.flush();
    }

    private static long power(long base, long exp, int mod) {
        long res = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) return true;
            ptr = 0;
            try {
                buflen = in.read(buffer, 0, buffer.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return buflen > 0;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            return -1;
        }

        public int nextInt() {
            int b = readByte();
            while (b <= 32) {
                if (b == -1) return -1;
                b = readByte();
            }
            int sgn = 1;
            if (b == '-') {
                sgn = -1;
                b = readByte();
            }
            int res = 0;
            while (b >= '0' && b <= '9') {
                res = res * 10 + b - '0';
                b = readByte();
            }
            return res * sgn;
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SHUFFLEEZ)