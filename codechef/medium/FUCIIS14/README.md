# FUCIIS14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiplication Table with Custom Range

A program that generates a  **multiplication table**  based on the  **number**  and  **range**  entered by the user. Complete the program by filling in the missing parts to ensure it correctly retrieves and displays the multiplication table.

 **Input:** 

- An integer representing the number for which the multiplication table is to be generated.
- An integer representing the range up to which the multiplication table should be printed.

Run the code, input the number and range, and verify that it correctly displays the multiplication table!

### Sample 1:
Input
Output

```
7
6
```

```
Multiplication Table for 7 up to 6:  
7 x 1 = 7  
7 x 2 = 14  
7 x 3 = 21  
7 x 4 = 28  
7 x 5 = 35  
7 x 6 = 42  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:52:40.777Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter the number for the multiplication table
        int number = scanner.nextInt(); // Fill in the blank

        // Prompt the user to enter the range for the table
        int range = scanner.nextInt(); // Fill in the blank

        // Printing the multiplication table header
        System.out.println("Multiplication Table for " + number + " up to " + range + ":");

        // Using a for loop to generate the table
        for (int i = 1; i <= range; i++) {  // Fill in the blanks
            System.out.println(number + " x " + i + " = " + (number * i)); // Fill in the blank
        }

        scanner.close(); // Close the Scanner object
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FUCIIS14)