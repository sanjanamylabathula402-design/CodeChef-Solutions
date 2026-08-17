# POOWVO30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Generating a Fibonacci Series Using While Loop

The  **Fibonacci series**  is a sequence of numbers where each term is the  **sum of the two preceding terms**, starting with `0` and `1`.
For example: `0, 1, 1, 2, 3, 5, 8, 13,...`

Your task is to write a program to generate the Fibonacci series based on user input.

 **Input:** 
Take the input for n, which represents the total number of terms to print.

 **Steps to Complete:** 

- Ask the user to enter the number of terms (must be ≥ 2).
- Use a while loop to generate and print the next Fibonacci numbers by summing the last two terms.
- Continue the loop until the required number of terms is printed.
### Sample 1:
Input
Output

```
7
```

```
Fibonacci Series: 0 1 1 2 3 5 8
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:34:49.145Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of terms
        int terms = scanner.nextInt();

        int first = 0, second = 1; // First two Fibonacci numbers
        int count = 2; // Counter to track the number of terms generated

        // Print first two numbers
        System.out.print("Fibonacci Series: " + first + " " + second + " ");

        // Use while loop to generate the remaining Fibonacci numbers
        while (count < terms) {
            int next = first + second; // Calculate the next term
            System.out.print(next + " "); // Print the term
            first = second; // Update values
            second = next;
            count++; // Increment counter
        }

        scanner.close(); // Close the scanner
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO30)