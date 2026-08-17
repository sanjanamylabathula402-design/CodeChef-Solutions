# CTMNMF08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print Multiplication Table

In this example, we will read a user input, generate a multiplication table, and display the results in a concise manner. This approach demonstrates using a `while` loop for repeated actions based on user input.

When executed, the code will display the multiplication table for the user input.

### Sample 1:
Input
Output

```
5
```

```
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:19:55.554Z  

```java
import java.util.Scanner;  // Import Scanner for user input  

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object  
        
        // Prompt the user to enter the number for which the table is generated  
        // Read the user's input directly and use it in the while loop
        int number = scanner.nextInt();  // Read user input using the scanner object

        int multiplier = 1;  // Initialize counter  

        // Loop will run until multiplier becomes equal to 10
        while (multiplier <= 10) {  
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));  
            multiplier++;  // Increment counter  
        }
        
        scanner.close();  // Close the scanner  
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF08)