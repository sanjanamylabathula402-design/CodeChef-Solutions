# ZWFPSZ03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Your Favorite Number

In this example, we demonstrate how to take user input and display it directly in Java using the `Scanner` class. This method allows efficient interaction with users by reading input dynamically.

In this program, the integer entered by the user is directly captured using `scanner.nextInt()` and immediately displayed using `System.out.println()`. This demonstrates how to efficiently capture and display an integer input from the user.

When executed, the code will prompt the user to enter a number. Based on the input, it will display:

### Sample 1:
Input
Output

```
42
```

```
Oh, 42 is a great choice!
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T08:45:55.534Z  

```java
// Importing the Scanner class for user input
import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the user's input directly and use it in an output statement
        // No variable is used to store the input; it is passed directly
        System.out.println("Oh, " + scanner.nextInt() + " is a great choice!");
        
        // Close the Scanner to release system resources
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ03)