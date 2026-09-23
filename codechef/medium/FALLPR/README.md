# FALLPR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fall Prevention

An array $A$ of length $N$ is called  *good*  if

$$ A_1 + A_2 + \ldots + A_i \ge 0 $$

for  *every*  $1 \le i \le N$.

You are given an array $A$. You may delete at most one element from the array, without changing the order of the remaining elements.
Is it possible to do this such that the resulting array is  *good* ?

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the array. The second line contains $N$ space-separated integers $A_1, \ldots, A_N$.
### Output Format

For each test case, output on a new line the answer: `Yes` if it's possible to obtain a good array after deleting at most one element, and `No` otherwise.

### Constraints
- $1 \leq T \leq 10^5$
- $2 \leq N \leq 2\cdot 10^5$
- $-10^4 \le A_i \le 10^4$
- The sum of $N$ over all test cases won't exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
4
4
1 0 2 -1
3
1 -2 -2
5
2 -1 -2 1 0
4
0 -1 -1 3

```

```
YES
NO
YES
NO

```

### Explanation:

 **Test case $1$:**  We have $A = [1, 0, 2, -1]$. The array is already  *good*  without deleting any elements, because the corresponding sums are:

- $1$
- $1+0=1$
- $1+0+2=3$
- $1+0+2+(-1) = 2$

which are all $\ge 0$.

 **Test case $2$:**  We have $A = [1, -2, -2]$.

- If we delete the $1$, the array starts with $-2$ and hence is not good.
- If we delete one of the $-2$'s, the array becomes $[1, -2]$ and $1+(-2) = -1 \lt 0$, so this isn't good either.

Thus, it's impossible to make the array  *good*  after a single deletion.

 **Test case $3$:**  We can delete $A_2 = -1$ to obtain the array $[2, -2, 1, 0]$, which can be verified to be  *good*.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T15:25:01.309Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);

        if (!st.hasMoreTokens()) return;
        int T = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[] C = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                while (st == null || !st.hasMoreTokens()) {
                    line = br.readLine();
                    if (line == null) break;
                    st = new StringTokenizer(line);
                }
                C[i] = Integer.parseInt(st.nextToken());
            }

            long minCost = Long.MAX_VALUE;

            // Iterate over all valid pairs of stalls (i, j) with 1 <= i < j <= N
            for (int i = 1; i <= N; i++) {
                for (int j = i + 1; j <= N; j++) {
                    // Check coverage conditions:
                    // 1. First light covers stall 1: i - 1 <= K
                    // 2. Second light covers stall N: N - j <= K
                    // 3. No unlit gap between the two lights: j - i <= 2 * K + 1
                    if (i - 1 <= K && N - j <= K && j - i <= 2 * K + 1) {
                        long cost = (long) C[i] + C[j];
                        if (cost < minCost) {
                            minCost = cost;
                        }
                    }
                }
            }

            if (minCost == Long.MAX_VALUE) {
                sb.append("-1\n");
            } else {
                sb.append(minCost).append("\n");
            }
        }

        System.out.print(sb);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FALLPR)