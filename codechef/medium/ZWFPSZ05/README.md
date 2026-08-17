# ZWFPSZ05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Add Two Number

Write a program to read two integers from the user, add them, and display the result using the given Scanner class. The `nextInt()` method allows us to directly capture integer input and perform arithmetic operations.

 **Steps to Complete:** 

- Read two integers from the user using the Scanner class.
- Add the two integers directly and display the result.
- Ensure proper closing of the Scanner object.

Run the code and input different integer values to observe how the program calculates their sum!

### Sample 1:
Input
Output

```
10
20
```

```
The sum is: 30
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T08:47:18.698Z  

```java
// Importing the Scanner class from the java.util package
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the keyboard (System.in)
        Scanner scanner = new Scanner(System.in);

        // Reading two integers from the user directly and adding them
        // Displaying the result of the addition
        System.out.println("The sum is: " + (scanner.nextInt() + scanner.nextInt()));

        // Closing the Scanner object to release resources and avoid memory leaks
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ05)