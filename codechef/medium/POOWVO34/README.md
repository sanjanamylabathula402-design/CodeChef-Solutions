# POOWVO34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Counting Vowels in a String

Vowels play an essential role in language processing. Your task is to complete a Java program that counts the number of vowels (in lowercase: a, e, i, o, u) in a given string using a while loop.

 **Steps to Follow:** 

- Use a while loop to iterate through each character in the string.
- Check if the current character is a vowel (a, e, i, o, u).
- Increment the vowel counter for each match.
- Print the total number of vowels found.

 **Expected Output:** 

```
Total number of vowels: 5

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:35:20.600Z  

```java
class Codechef {
    public static void main(String[] args) {
        String text = "Programming is fun"; // Input string
        int count = 0; // Counter for vowels
        int i = 0; // Loop index
        char ch;
        
        while (i < text.length()) { // Iterate through each character
            ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                count++; // Increment counter if character is a vowel
            }
            i++; // Move to the next character
        }

        System.out.println("Total number of vowels: " + count);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO34)