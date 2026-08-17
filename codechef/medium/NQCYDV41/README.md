# NQCYDV41

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Identifying Case Sensitivity Issues

A developer is debugging a code that counts occurrences of a specific string - 'hello'.
The function should be case-insensitive, but the results are incorrect.
To troubleshoot, the developer adds print statements.

```
    public static void main(String[] args) {
        String textSample = "Hello world! This is a hello world example.";
        String word = "hello";

        System.out.println("DEBUG: Searching for '" + word + "' in text.");  // Debugging print
        
        String[] words = textSample.split(" ");  // Split text into words
        System.out.println("DEBUG: Word list -> " + Arrays.toString(words));  // Debugging print to check split output

        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        System.out.println(count);
    }

```

### Debug output

```
DEBUG: Searching for 'hello' in text.
DEBUG: Word list -> [Hello, world!, This, is, a, hello, world, example.]
1

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T16:56:27.022Z  

```cpp
class CodeChef {
    public static void main(String[] args) {
        String input = "abcde";  // Define the input string
        int total = 0;  // Initialize the total variable to zero

        System.out.println("Starting loop...");  // Print a message indicating the start of the loop

        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // Get the current character
            System.out.println("Current character: " + ch);  // Print the current character
            
            total += ch;  // Add the ASCII value of the character to total
            
            System.out.println("Total so far (ASCII sum): " + total);  // Print running total
        }

        // After the loop finishes, print the final total
        System.out.println("Final total (ASCII sum): " + total);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/NQCYDV41)