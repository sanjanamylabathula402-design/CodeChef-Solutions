# FUCIIS04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Iterating through each character

Which of the following correctly iterates through the string `"Hello"` in reverse order?

```
class Codechef {
    public static void main(String[] args) {
        String text = "Hello";
        for (/ *condition* /) {
            System.out.print(text.charAt(i));
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:43:36.983Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/FUCIIS04)