# POOWVO24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Inverted Right-Angled Triangle Pattern

What will be the output of the following Java code snippet.

```
class Codechef {
    public static void main(String[] args) {
        int row = 4;

        while (row >= 1) {
            int col = 1;
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row--;
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:31:23.810Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        int row = 1; // Initialize row counter
        int totalRows = 5; // Total rows in the triangle

        // Outer while loop: controls the number of rows
        while (row <= totalRows) {
            int column = 1; // Reset column counter for each row

            // Inner while loop: prints '*' for the current row
            while (column <= row) {
                System.out.print("* "); // Print '*' with a space
                column++; // Increment column counter
            }

            System.out.println(); // Move to the next line after printing a row
            row++; // Increment row counter
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO24)