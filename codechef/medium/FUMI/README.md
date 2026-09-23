# FUMI

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fumigation

Chef's house has $N$ rooms, which for some reason are arranged in a row. The rooms are numbered $1$ to $N$, from left to right.

Chef is dealing with a pest problem, and so has no choice but to fumigate his house.

A fumigation machine has three parameters: the distance it can travel, $X$; its spraying strength, $Y$; and its linger period, $Z$.
A fumigation machine with parameters $(X, Y, Z)$ behaves as follows:

- It will start at room $1$.
- Then, every second, repeat the following: Suppose the machine is currently at position $p$. It will move to some position $q \in [1, N]$ such that $|p-q| \le X$. Then, it will spray fog into rooms $q, q+1, \ldots, \min(N, q+Y-1)$. The sprayed fog will remain in these rooms for the next $Z$ seconds, i.e. if the spraying was done at time $t$ then it will be present at times $t, t+1, \ldots, t+Z-1$.

Chef thinks his house is  *safe*  if there exists an instant of time in which  **every**  room contains fog, simultaneously.

Buying a powerful machine naturally costs more.
In particular, you are given three parameters $A, B,$ and $C$; meaning that buying a machine with parameters $(X, Y, Z)$ costs $AX + BY + CZ$ coins.

Find the minimum number of coins Chef must spend in order to buy a machine that can possibly result in his house being  *safe*, if the movements of the machine are made optimally.

Note that each of $X, Y,$ and $Z$ must be  **positive integers**  for the bought machine.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of a single line of input, containing four space-separated integers $N, A, B, C$.
### Output Format

For each test case, output on a new line the minimum cost of making Chef's house safe.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq N \leq 2\cdot 10^6$
- $1 \le A, B, C \le 10^9$
- The sum of $N$ over all test cases won't exceed $2\cdot 10^6$.
### Sample 1:
Input
Output

```
5
1 4 7 3
2 1 1 1
5 1 2 2
5 1 4 3
12 7 9 4

```

```
14
4
12
19
56

```

### Explanation:

 **Test case $1$:**  There's only one room. Choose $(X, Y, Z) = (1, 1, 1)$ and immediately spray fog into room $1$ since we start there. This has a cost of $4+7+3 = 14$, and is clearly minimum since we're constrained to have $X, Y, Z \ge 1$.

 **Test case $2$:**  There are two rooms. One solution is to choose $(X, Y, Z) = (1, 1, 2)$ and do the following:

- Second $1$: spray in room $1$. Since $Y = 1$ only this room is sprayed. Since $Z = 2$, this room will have fog in it for the next $2$ seconds.
- Second $2$: move and spray room $2$. Room $2$ now has fog, and room $1$ still has fog; so we're done.

The cost of this is $1+1+1\cdot 2 = 4$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T15:40:05.150Z  

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        StringBuilder sb = new StringBuilder();
        
        if (!sc.hasNext()) return;
        int T = sc.nextInt();
        
        while (T-- > 0) {
            long N = sc.nextLong();
            long A = sc.nextLong();
            long B = sc.nextLong();
            long C = sc.nextLong();
            
            // Case 1: Z = 1 (k = 0) -> Y = N, X = 1
            long minCost = A + B * N + C;
            
            // Case 2: Z >= 2 (k = Z - 1 >= 1)
            // We iterate over k = 1 to N
            for (long k = 1; k <= N; k++) {
                // We want to test key values of X for a given k:
                // 1) X = 1 (minimal X)
                // 2) X such that k * X + X >= N  =>  X = ceil(N / (k + 1))
                
                // Option A: X = 1
                long X1 = 1;
                long Y1 = Math.max(X1, N - k * X1);
                long cost1 = A * X1 + B * Y1 + C * (k + 1);
                if (cost1 < minCost) {
                    minCost = cost1;
                }
                
                // Option B: X = ceil(N / (k + 1)), where Y = X
                long X2 = (N + k) / (k + 1); // equivalent to ceil(N / (k + 1))
                if (X2 >= 1) {
                    long Y2 = Math.max(X2, N - k * X2);
                    long cost2 = A * X2 + B * Y2 + C * (k + 1);
                    if (cost2 < minCost) {
                        minCost = cost2;
                    }
                }
                
                // Early break optimization when C * k exceeds current minCost
                if (C * (k + 1) >= minCost) {
                    break;
                }
            }
            
            sb.append(minCost).append("\n");
        }
        
        System.out.print(sb);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024 * 64];
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
            return hasNextByte() ? buffer[ptr++] : -1;
        }

        public boolean hasNext() {
            while (hasNextByte() && buffer[ptr] <= ' ') ptr++;
            return hasNextByte();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            while (b >= '0' && b <= '9') {
                n = n * 10 + (b - '0');
                b = readByte();
            }
            return minus ? -n : n;
        }

        public int nextInt() {
            return (int) nextLong();
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FUMI)