# MATNEARESTO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Distance to Nearest 0

Given is a `N x M` binary matrix, for each cell find its distance from the nearest `0`.

 **Note:**  Distance between vertically or horizontally adjacent cells is `1`. (See the sample input/output for more clarity)

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the matrix.
- Next $N$ lines containing $M$ space separated integers, the elements of the matrix.
### Output Format
- Output $N$ lines containing $M$ space separated integers, the distance of each cell from nearest 0.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are either 0 or 1.
- There is at least one 0 in the matrix.
### Sample 1:
Input
Output

```
3 3
0 1 1
0 1 0
1 1 1
```

```
0 1 1
0 1 0
1 2 1
```

### Explanation:

Positions are written as $(row, column)$, starting from $1$.

- Cells $(1,1)$, $(2,1)$, and $(2,3)$ contain $0$, so their distance is $0$.
- Cells $(1,2)$, $(1,3)$, $(2,2)$, $(3,1)$, and $(3,3)$ are horizontally or vertically adjacent to a cell containing $0$, so their distance is $1$.
- Cell $(3,2)$ requires at least $2$ moves to reach a $0$. For example, move left to $(3,1)$, then up to $(2,1)$. Its distance is therefore $2$.

Only horizontal and vertical moves are allowed; diagonal moves are not allowed.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-28T16:02:39.684Z  

```java
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int A[][] = new int[N][M];
        int dist[][] = new int[N][M];

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();

                if (A[i][j] == 0) {
                    dist[i][j] = 0;
                    q.add(i * M + j);
                } else {
                    dist[i][j] = -1;
                }
            }
        }

        int rowMove[] = {-1, 1, 0, 0};
        int colMove[] = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            int current = q.poll();

            int row = current / M;
            int col = current % M;

            for (int k = 0; k < 4; k++) {
                int newRow = row + rowMove[k];
                int newCol = col + colMove[k];

                if (newRow >= 0 && newRow < N &&
                    newCol >= 0 && newCol < M &&
                    dist[newRow][newCol] == -1) {

                    dist[newRow][newCol] = dist[row][col] + 1;

                    q.add(newRow * M + newCol);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATNEARESTO)