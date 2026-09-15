# MATMCQ1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Matrix Types

Which matrix is obtained by interchanging its rows and columns?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-15T11:27:42.318Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        assert (1 <= n && n <= 100);

        int[][] mat = new int[n][n];
        int val = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = val++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATMCQ1)