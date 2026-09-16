# JUMPINGOV

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Jumping Over

You are given a permutation $P$ of the integer $[1, N]$ and can perform the following operation:

- Choose an index $i$, and move it to the front or the back of the permutation (appropriately shifting the other indices).
- The cost of moving it to the front is $(i - 1)$, and the cost of moving it to the back is $(N - i)$, i.e. the cost is simply the number of elements it jumps over.

Find the minimum total cost of operations needed to sort the permutation $P$.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $P_1, P_2, \ldots, P_N$.
### Output Format

For each test case, output on a new line the minimum cost.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $1 \le P_i \le N$
- $P_i \ne P_j$ for all $i \ne j$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$
### Sample 1:
Input
Output

```
4
2
2 1
4
4 2 3 1
3
1 2 3
6
2 4 1 6 5 3

```

```
1
5
0
10
```

### Explanation:

 **Test Case 1:**  You can choose the element $2$ at index $1$ and move it back, jumping over $1$ element. Then, the permutation is sorted, so the cost is only $1$.

 **Test Case 2:**  Move the value $4$ to the back, cost $3$, permutation is $[2, 3, 1, 4]$; and then move the value $1$ to the front, cost $2$. The total cost is $5$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T16:22:46.161Z  

```java
import java.io.*;
import java.util.*;
class Codechef {

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');

            int num = 0;

            while (c > ' ') {
                num = num * 10 + (c - '0');
                c = read();
            }

            return num;
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner sc = new FastScanner();

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();

            int[] P = new int[N + 1];
            int[] pos = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                P[i] = sc.nextInt();
                pos[P[i]] = i;
            }
            long answer = Long.MAX_VALUE;

            long leftCost = 0;

            for (int l = 1; l <= N; l++) {

                if (l > 1) {
                    int x = l - 1;

                    leftCost += pos[x] - 1;

                    for (int y = 1; y < x; y++) {
                        if (pos[y] > pos[x]) {
                            leftCost++;
                        }
                    }
                }

                long rightCost = 0;

                for (int r = N; r >= l; r--) {
                    if (r < N) {
                        int x = r + 1;

                        rightCost += N - pos[x];

                        for (int y = r + 2; y <= N; y++) {
                            if (pos[y] < pos[x]) {
                                rightCost++;
                            }
                        }
                    }
                    boolean possible = true;

                    for (int x = l; x < r; x++) {
                        if (pos[x] > pos[x + 1]) {
                            possible = false;
                            break;
                        }
                    }

                    if (possible) {
                        answer = Math.min(answer, leftCost + rightCost);
                    }
                }
            }

            System.out.println(answer);
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JUMPINGOV)