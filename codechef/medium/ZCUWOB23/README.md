# ZCUWOB23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Multiplication Table

In this example, we demonstrate how to use nested for loops to generate a multiplication table. The outer loop represents the row numbers, while the inner loop calculates the product of row and column values.

 **When executed, the code will show:** 

```
1   2   3   4  
2   4   6   8  
3   6   9  12  
4   8  12  16  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:39:32.932Z  

```java
class Codechef {
    public static void main(String[] args) {
        int size = 4; // Define table size (4x4)

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                System.out.print((i * j) + "\t"); // Print product with tab space
            }
            
            System.out.println(); // Move to the next line after printing a row
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB23)