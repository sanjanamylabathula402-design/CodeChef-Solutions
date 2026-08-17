# POOWVO19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Nested While Loop

What will be the output of the following Java program that uses a  **nested while loop**  to print the  **multiplication table**  for numbers 1 to 3?

```
class Codechef{
    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.print(i * j + "\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:30:16.388Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/POOWVO19)