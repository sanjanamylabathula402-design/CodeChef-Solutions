# ZWFPSZ29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### replace() Method

How does the `replace()` method help in formatting user input?

```
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        
        String formattedInput = userInput.replace("-", "_");
        
        System.out.println("Formatted Output: " + formattedInput);
        
        scanner.close();
    }
}

```

If the user enters:

```
Java-Programming

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:21:39.574Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ29)