# FUCIIS19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Summation of a Mathematical Series

A program that calculates the  **sum of the squares of the first `'n'` natural numbers**. Complete the program by filling in the missing parts to ensure it correctly calculates and displays the sum.

### Sample 1:
Input
Output

```
4
```

```
The sum of the squares of the first 4 natural numbers is: 30  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:55:47.861Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the value of 'n'
        int n = scanner.nextInt();

        int sum = 0; // Initialize the sum to 0

        // Use a for loop to calculate the summation of squares
        for (int i = 1; i <= n; i++) {
            sum += i * i; // Add the square of each number to the sum
        }

        // Print the result
        System.out.println("The sum of the squares of the first " + n + " natural numbers is: " + sum);
        
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FUCIIS19)