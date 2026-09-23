# MKSMT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Smoothen

For an array $B$ of length $M$, and an integer $X$, define  *smoothing*  b with respect to $X$ as follows:

- Start with $S = 0$
- For each $i = 1, 2, 3, \ldots, M$ in order: If $B_i \ge X$, add $B_i - X$ to $S$ and set $B_i = X$. If $B_i \lt X$, add $\min(S, X-B_i)$ to $B_i$ and subtract the same value from $S$.

Note that $S$ may be positive in the end, but that's fine - we don't do anything with this "extra" value.

For example, if $B = [4, 6, 1, 5, 1]$,

- Smoothing it with $X = 2$ will result in $[2, 2, 2, 2, 2]$.
- Smoothing it with $X = 4$ will result in $[4, 4, 3, 4, 2]$.

You're given an array $A$.
Find the  **largest**  positive integer $X$ such that there exists a pair of integers $(L, R)$ ($1 \le L \le R \le N$) satisfying the following:

- If the subarray of $A$ from index $L$ to index $R$ is smoothed by $X$, the entire array $A$ becomes sorted in non-decreasing order.

If there are arbitrarily large values of $X$ that can cause $A$ to become sorted after smoothing a subarray, print $-1$ instead.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$ — the length of the array. The second line contains $N$ space-separated integers $A_1, \ldots, A_N$.
### Output Format

For each test case, on a new line:

- If there's no finite maximum $X$, print $-1$.
- Otherwise print the maximum valid $X$.
### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq N \leq 2\cdot 10^5$
- $1 \le A_i \le 10^9$
- The sum of $N$ over all test cases won't exceed $2\cdot 10^5$.
### Sample 1:
Input
Output

```
3
4
2 4 4 7
5
2 7 3 3 9
6
1 2 10 3 4 20

```

```
-1
4
5

```

### Explanation:

 **Test case $1$:**  The array is already sorted, so any value of $X$ is valid (for example by choosing $L=R=1$ always). There is no finite maximum valid $X$, so we output $-1$.

 **Test case $2$:**  We have $A = [2, 7, 3, 3, 9]$. Consider choosing $X = 4, L = 2, R = 4$.

- We want to smoothen the subarray $[7, 3, 3]$ with respect to $4$. This will occur as follows:
- Initially, $S = 0$.
- When processing $7$, we add $7-4 = 3$ to $S$ and then set the $7$ to $4$. The subarray is now $[4, 3, 3]$.
- When processing the first $3$, we add $1$ to it and subtract $1$ from $S$. The subarray is now $[4, 4, 3]$ and $S = 2$.
- When processing the second $3$, we again add $1$ to it and subtract $1$ from $S$. The subarray is now $[4, 4, 4]$ and $S = 1$.

After smoothing this subarray, the array is $[2, 4, 4, 4, 9]$ which is sorted.

It can be verified that for any $X \gt 4$, no choice of subarray can make the array sorted; so the answer is $4$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T15:37:10.793Z  

```java
import java.io.InputStream;
import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        StringBuilder output = new StringBuilder();

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            long maxVal = 0;
            boolean isSorted = true;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                if (a[i] > maxVal) maxVal = a[i];
                if (i > 0 && a[i - 1] > a[i]) {
                    isSorted = false;
                }
            }

            if (isSorted) {
                output.append("-1\n");
                continue;
            }

            // Binary search for maximum valid X
            long low = 1, high = maxVal;
            long ans = -1;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                if (canSortWithX(a, n, mid)) {
                    ans = mid;
                    low = mid + 1; // Try to find a larger X
                } else {
                    high = mid - 1;
                }
            }

            output.append(ans).append("\n");
        }

        System.out.print(output);
    }

    private static boolean canSortWithX(long[] a, int n, long x) {
        int firstGt = -1, lastGt = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > x) {
                if (firstGt == -1) firstGt = i;
                lastGt = i;
            }
        }

        // If no element is > x, any interval containing inversions works
        int l = (firstGt != -1) ? firstGt : 0;
        int r = (lastGt != -1) ? lastGt : n - 1;

        // Expand L and R to cover any prefix/suffix inversions outside [L, R]
        for (int i = 0; i < l; i++) {
            if (i > 0 && a[i - 1] > a[i]) {
                l = 0;
                break;
            }
        }
        for (int i = r + 1; i < n; i++) {
            if (i > 0 && a[i - 1] > a[i]) {
                r = n - 1;
                break;
            }
        }

        // Simulate smoothing on a[L..R]
        int m = r - l + 1;
        long[] b = new long[m];
        for (int i = 0; i < m; i++) {
            b[i] = a[l + i];
        }

        long s = 0;
        for (int i = 0; i < m; i++) {
            if (b[i] >= x) {
                s += (b[i] - x);
                b[i] = x;
            } else {
                long add = Math.min(s, x - b[i]);
                b[i] += add;
                s -= add;
            }
        }

        // Check if smoothed segment is sorted internally
        for (int i = 0; i < m - 1; i++) {
            if (b[i] > b[i + 1]) return false;
        }

        // Check boundary condition with left neighbour
        if (l > 0 && b[0] < a[l - 1]) return false;

        // Check boundary condition with right neighbour
        if (r < n - 1 && b[m - 1] > a[r + 1]) return false;

        return true;
    }

    static class FastScanner {
        private final InputStream stream;
        private final byte[] buffer = new byte[1024 * 32];
        private int head = 0;
        private int tail = 0;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (tail == -1) throw new InputMismatchException();
            if (head >= tail) {
                head = 0;
                try {
                    tail = stream.read(buffer, 0, buffer.length);
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
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = read();
            } while (c > ' ');
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return -1;
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') throw new InputMismatchException();
                res = res * 10 + c - '0';
                c = read();
            } while (c > ' ');
            return res * sgn;
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MKSMT)