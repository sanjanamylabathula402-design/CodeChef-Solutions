# ZWFPSZ28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Case Conversion

In this example, we demonstrate how to  **format user input**  by converting it to  **lowercase**  and  **uppercase**  using Java’s `toLowerCase()` and `toUpperCase()` methods.

- The toLowerCase() method converts all characters in the string to lowercase.
- The toUpperCase() method converts all characters in the string to uppercase.
### Sample 1:
Input
Output

```
Java Programming
```

```
Lowercase: java programming  
Uppercase: JAVA PROGRAMMING

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:21:31.842Z  

```java
import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read a line of input provided by the user
        String userInput = scanner.nextLine(); // Capture user input as a string

        // Convert the input string to lowercase and display the result
        System.out.println("Lowercase: " + userInput.toLowerCase()); 
        // The toLowerCase() method converts all characters in the string to lowercase.

        // Convert the input string to uppercase and display the result
        System.out.println("Uppercase: " + userInput.toUpperCase());
        // The toUpperCase() method converts all characters in the string to uppercase.

        // Close the Scanner object to release system resources
        scanner.close(); 
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ28)