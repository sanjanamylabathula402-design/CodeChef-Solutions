# POOWVO18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Generating a 4x4 Grid

In this example, we demonstrate how to use nested while loops to generate a 4-row, 4-column grid with coordinates. This approach helps in structuring tabular data, working with matrices, and printing patterns efficiently.

 **When executed, the code will show:** 

```
(1,1) (1,2) (1,3) (1,4)  
(2,1) (2,2) (2,3) (2,4)  
(3,1) (3,2) (3,3) (3,4)  
(4,1) (4,2) (4,3) (4,4)  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:30:01.956Z  

```java
class Codechef {
    public static void main(String[] args) {
        int row = 1; // Initialize row counter

        // Outer loop: Iterates through 4 rows
        while (row <= 4) {  
            int column = 1; // Reset column for each row

            // Inner loop: Iterates through 4 columns
            while (column <= 4) {  
                System.out.print("(" + row + "," + column + ") "); // Print cell coordinates
                column++; // Increment column
            }

            System.out.println(); // Move to the next line after completing a row
            row++; // Increment row counter
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO18)