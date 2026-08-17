# FUCIIS20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Even Numbers in a Series

Write a program that takes an integer input representing the upper limit (`n`) and calculates the sum of all even numbers from `1` to `n`. If a number is evenly divisible by `2`, it is considered even and added to the sum.

 **Input:** 
A single integer representing the upper limit of the series.

Run the code, enter different values, and check how the sum of even numbers changes!

### Sample 1:
Input
Output

```
10
```

```
The sum of even numbers is: 30  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:56:03.677Z  

```java
import java.util.Scanner; // Import the Scanner class for user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt(); 
        int sum = 0; // Initialize the variable to store the sum of even numbers

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the current number is even
            if (i % 2 == 0) { // Numbers divisible by 2 are even
                sum += i; // Add the even number to the sum
            }
        }

        // Print the final sum of all even numbers in the range
        System.out.println("The sum of even numbers is: " + sum);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FUCIIS20)