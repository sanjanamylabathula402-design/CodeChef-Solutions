# CMOOVU29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fill in the Blank -Implement Column-Major Traverse

Complete the missing parts in the code that calculates the total sum of a  **3x3 matrix**  using  **column-major traversal**  (i.e., iterating over columns first, then rows).

 **Expected Output:** 

```
Total Sum: 45

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:34:16.937Z  

```java
class Codechef {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},  
            {4, 5, 6},  
            {7, 8, 9}   
        };

        int sum = 0;

        // Column-major traversal
        for (int j = 0; j < 3; j++) {  // Iterate over columns first
            for (int i = 0; i < 3; i++) {  // Iterate over rows next
                sum += matrix[i][j];  // Access elements in column-major order
            }
        }

        System.out.println("Total Sum: " + sum);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CMOOVU29)