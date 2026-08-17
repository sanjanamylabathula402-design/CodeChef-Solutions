# FUCIIS05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Replace vowels with asterisks in a string

Write a program that takes a string as input and replaces all vowels with an asterisk (`*`). The program should use a `for` loop to iterate through each character and modify the string accordingly.

 **Input:** 
A single string entered by the user.

 **Steps to Complete:** 

- Read a string from the user using the Scanner class.
- Iterate through each character and check if it is a vowel (a, e, i, o, u). If the character is a vowel, replace it with '*', otherwise, keep it unchanged. Append the character or asterisk to the String.
- Print the modified string with vowels replaced by asterisks.
### Sample 1:
Input
Output

```
Programming is awesome!

```

```
Result: Pr *gr* mm *ng* s  *w* s *m* !

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:43:53.509Z  

```java
import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read the user's input as a string
        String input = scanner.nextLine();
        
        // Create a StringBuilder object to construct the output string
        StringBuilder result = new StringBuilder();
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // Convert the current character to lowercase for comparison
            char c = Character.toLowerCase(input.charAt(i));
            
            // Check if the character is a vowel (a, e, i, o, u)
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                // If it is a vowel, append an asterisk (*) to the result
                result.append('*');
            } else {
                // If it is not a vowel, append the original character to the result
                result.append(input.charAt(i));
            }
        }
        
        // Print the final result string with vowels replaced by asterisks
        System.out.println("Result: " + result.toString());
        
        // Close the scanner to release resources
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FUCIIS05)