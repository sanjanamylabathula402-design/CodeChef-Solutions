# FUCIIS09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Printing a Reverse Triangle of Numbers

A program that prints a  **reverse triangle pattern**  based on the number of  **rows**  entered by the user. Complete the program by ensuring it reads the number of rows from user input and displays the pattern accordingly.

 **Input:** 
An integer representing the number of rows for the reverse triangle.

Run the code, input the number of rows, and verify that it correctly displays the reverse triangle pattern!

### Sample 1:
Input
Output

```
5
```

```
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:51:39.036Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in); 
        int rows = scanner.nextInt(); 

        // Outer loop to iterate over each row in the pattern
        for (int i = rows; i >= 1; i--) {
            // Inner loop to print numbers in increasing order for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print the current number followed by a space
            }
            // Move to the next line after completing the current row
            System.out.println();
        }

        scanner.close(); // Close the Scanner object to release resources
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FUCIIS09)