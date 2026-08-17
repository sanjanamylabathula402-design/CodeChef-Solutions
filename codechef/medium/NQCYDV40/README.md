# NQCYDV40

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Debugging a Loop

In this example, we demonstrate how to calculate the sum of a ascii values of letters in a string using a loop in Java.

- You can define a string, and then use a for loop to iterate through each letter / character.
- Inside the loop, a running total is updated, and print statements are used to display the current character and the total so far.

When executed, the code will display the current character being processed and the cumulative total at each step.

```
Starting loop...
Current character: a
Total so far (ASCII sum): 97
Current character: b
Total so far (ASCII sum): 195
Current character: c
Total so far (ASCII sum): 294
Current character: d
Total so far (ASCII sum): 394
Current character: e
Total so far (ASCII sum): 495
Final total (ASCII sum): 495

```

This example illustrates how you can use a loop and print statements to track the accumulation of values and display intermediate results, making it easier to understand the calculation process.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T16:56:18.722Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/NQCYDV40)