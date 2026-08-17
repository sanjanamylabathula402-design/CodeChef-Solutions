# POOWVO23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Printing a Right-Angled Triangle

In this example, we demonstrate how to we use nested while loops, to print a right-angled triangle pattern starts with one `*` in the first row and increases by one in each subsequent row.

 **When executed, the code will show:** 

```
*  
 **   
 **  *  
 **   **   
 **   **  *  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:31:16.944Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/POOWVO23)