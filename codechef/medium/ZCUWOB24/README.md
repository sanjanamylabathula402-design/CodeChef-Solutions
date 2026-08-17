# ZCUWOB24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Nested For Loop

What will be the output of the following Java program?

```
class Codechef {
    public static void main(String[] args) {
        int rows = 4;

        // Outer loop
        for (int i = 1; i <= rows; ++i) {

            // Inner loop to print numbers
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:39:39.197Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/ZCUWOB24)