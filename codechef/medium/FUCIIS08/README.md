# FUCIIS08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create a Number Triangle

In this example, we demonstrate how  **nested for loops**  can be used to generate a  **grid of numbers**  based on user input. The program prompts the user to enter the number of rows, then prints a  **square pattern**  where each row contains sequential numbers from `1` to the given row count.

When executed, the code will display a square grid of numbers based on user input, showcasing how nested loops control row and column iterations in Java.

### Sample 1:
Input
Output

```
3
```

```
1 2 3 
1 2 3 
1 2 3 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:44:11.057Z  

```java
import java.util.Scanner; // Import the Scanner class for user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in); 
        
        // Prompt the user to enter the number of rows
        int rows = scanner.nextInt();

        // Outer loop to iterate through each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to iterate through each column in the current row
            for (int j = 1; j <= rows; j++) {
                // Print the current column number with a space
                System.out.print(j + " ");
            }
            // Move to the next line after printing all columns for the current row
            System.out.println();
        }

        scanner.close(); // Close the Scanner object to release resources
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FUCIIS08)