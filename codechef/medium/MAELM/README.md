# MAELM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Matrix Element Match

You are given an $N \times N$ matrix $A$ and an $M \times M$ matrix $B$.

Matrix $B$ is considered present in $A$ if every element of $B$ can be matched with an equal element in $A$,  **regardless of its position**.

Each occurrence in $A$ can be used only once. Therefore, if a value appears multiple times in $B$, it must appear at least the same number of times in $A$.

For example, if `5` appears twice in $B$, then $A$ must also contain at least two occurrences of `5`.

Determine whether all elements of $B$ can be matched in $A$.

### Input Format
- The first line contains an integer $N$ — the size of matrix $A$.
- The second line contains an integer $M$ — the size of matrix $B$.
- Each of the next $N$ lines contains $N$ space-separated integers representing matrix $A$.
- Each of the next $M$ lines contains $M$ space-separated integers representing matrix $B$.
### Output Format

Print `TRUE` if every element of $B$ can be matched with an equal element in $A$, using each occurrence in $A$ at most once.

Otherwise, print `FALSE`.

### Constraints
- $1 \le M \le N \le 500$
- $-10^9 \le A_{i,j}, B_{i,j} \le 10^9$
### Sample 1:
Input
Output

```
3
2
1 7 2
8 3 6
9 5 3
1 2
3 3
```

```
TRUE
```

### Explanation:

Matrix $B$ contains `1`, `2`, `3`, and `3`.

Each of these values is present in matrix $A$, so the answer is `TRUE`.

### Sample 2:
Input
Output

```
3
3
1 2 3
4 5 6
7 8 9
1 2 2
4 5 5
7 8 8
```

```
FALSE
```

### Explanation:

Matrix $B$ requires two occurrences each of `2`, `5`, and `8`.

Matrix $A$ contains only one occurrence of each of these values.

Therefore, all elements of $B$ cannot be matched, and the answer is `FALSE`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T16:00:08.745Z  

```java
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int A[] = new int[N * N];
        int B[] = new int[M * M];

        for (int i = 0; i < N * N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < M * M; i++) {
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        int j = 0;

        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                break;
            }
        }

        if (j == B.length) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MAELM)