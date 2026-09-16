# FARSWAP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Far Swapping (Ver 2)

You are given a permutation $P$ of the integers $[1, N]$. You can use the following operation as many times as you want:

- Choose an index $i$ ($1 \le i < N$) such that $|P_i - P_{i + 1}| > 1$
- Swap $P_i$ and $P_{i + 1}$.

Count the number of permutations that are reachable using the above operation multiple times (possibly $0$). Since the answer may be large, find it modulo $998244353$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $P_1, P_2, \ldots, P_N$.
### Output Format

For each test case, output on a new line the number of reachable permutations modulo $998244353$.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 3000$
- $1 \le P_i \le N$
- $P_i \ne P_j$ for all $i \ne j$
- The sum of $N^2$ over all test cases does not exceed $3000^2$
### Sample 1:
Input
Output

```
3
3
1 3 2
3
3 2 1
5
5 2 3 1 4

```

```
2
1
11
```

### Explanation:

 **Test Case 1:**  $[1, 3, 2]$ and $[3, 1, 2]$ are reachable. The former is just the original permutation itself, and the latter can be reached by swapping $P_1$ and $P_2$. Note that $2 = P_3$ cannot be swapped with anybody due to the absolute difference $> 1$ condition.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T16:15:31.966Z  

```java
import java.io.*;
import java.util.*;
class Codechef 
{
    static final long MOD = 998244353;
    public static void main(String[] args) throws Exception
    {
        FastScanner sc = new FastScanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) 
        {
            int N = sc.nextInt();
            int[] P = new int[N];
            int[] pos = new int[N + 1];
            for (int i = 0; i < N; i++)
            {
                P[i] = sc.nextInt();
                pos[P[i]] = i;
            }
            boolean[] sign = new boolean[N];
            for (int i = 1; i < N; i++) {
                sign[i] = pos[i] < pos[i + 1];
            }
            long[] dp = new long[N + 1];
            long[] next = new long[N + 1];
            dp[1] = 1;
            for (int i = 1; i < N; i++)
            {
                long sum = 0;
                if (sign[i]) 
                {
                    for (int j = 1; j <= i + 1; j++) 
                    {
                        if (j > 1)
                        {
                            sum += dp[j - 1];
                            if (sum >= MOD)
                                sum -= MOD;
                        }
                        next[j] = sum;
                    }
                } else {
                    sum = 0;
                    for (int j = i; j >= 1; j--) 
                    {
                        sum += dp[j];
                        if (sum >= MOD)
                            sum -= MOD;
                        next[j] = sum;
                    }
                    next[i + 1] = 0;
                }

                long[] temp = dp;
                dp = next;
                next = temp;
                Arrays.fill(next, 0);
            }
            long answer = 0;
            for (int j = 1; j <= N; j++)
            {
                answer += dp[j];
                if (answer >= MOD)
                    answer -= MOD;
            }
            System.out.println(answer);
        }
    }
    static class FastScanner
    {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;
        FastScanner(InputStream in)
        {
            this.in = in;
        }
        private int read() throws IOException
        {
            if (ptr >= len) 
            {
                len = in.read(buffer);
                ptr = 0;

                if (len <= 0)
                    return -1;
            }

            return buffer[ptr++];
        }

        int nextInt() throws IOException {

            int c;
            do {
                c = read();
            } while (c <= ' ');

            int sign = 1;

            if (c == '-') {
                sign = -1;
                c = read();
            }

            int res = 0;

            while (c > ' ') {
                res = res * 10 + (c - '0');
                c = read();
            }

            return res * sign;
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FARSWAP)