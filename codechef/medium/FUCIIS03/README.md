# FUCIIS03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Reverse a String

In this example, we demonstrate how to use a `for` loop to iterate through a string in reverse order. This method helps in understanding how to manipulate strings using loops in Java.

The loop iterates through each character of the string starting from the last index and moves towards the first. The `charAt()` method is used to access individual characters, and `System.out.print()` displays them sequentially in reverse order.

### Sample 1:
Input
Output

```
Java Programming
```

```
Characters in reverse order: 
gnimmargorP avaJ

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:43:30.614Z  

```java
import java.util.Scanner; // Import Scanner class for user input

class Codechef { 
    public static void main(String[] args) { 
        // Initialize a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in); 
        
        // Store the user's input in a variable called "text"
        String text = scanner.nextLine(); 

        // Inform the user that the program will display characters in reverse order
        System.out.println("Characters in reverse order: "); 
        
        // Loop through the string in reverse order
        for (int i = text.length() - 1; i >= 0; i--) {
            // Print each character of the string starting from the last character
            System.out.print(text.charAt(i)); 
        }
        
        // Print a new line after displaying all characters in reverse
        System.out.println(); 
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FUCIIS03)