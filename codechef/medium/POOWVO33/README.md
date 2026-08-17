# POOWVO33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Counting Letters in a String

In this example, we demonstrate how to use a while loop to count the number of letters in a string. The program iterates through each character, ignoring spaces, and calculates the total number of letters. This method helps in efficiently processing text in Java.

 **When executed, the code will show:** 

```
Total number of letters: 17

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:35:06.067Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String text = "It is a beautiful day"; // Input string

        // Step 2: Initialize variables
        int count = 0; // Counter for letters
        int i = 0; // Loop index

        // Step 3: Iterate through each character in the string
        while (i < text.length()) { // Loop continues until the last character
            if (Character.isLetter(text.charAt(i))) { // Check if the character is a letter
                count++; // Increment counter if it's a letter
            }
            i++; // Move to the next character
        }

        // Step 4: Print the total number of letters in the string
        System.out.println("Total number of letters: " + count);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO33)