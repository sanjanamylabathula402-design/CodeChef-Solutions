# JAVATC08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Changes are necessary

Write a  **Java program**  that converts a user-entered string to a floating-point number and a `null` value to a floating-point number. The program should handle the following cases:

- NumberFormatException – If the input cannot be converted to a float (e.g., a string with letters).
- NullPointerException – When null cannot be converted to float.

The program should display appropriate error messages instead of crashing.

### Input Format
- The user will enter a value that needs to be converted to a floating-point number.
### Output Format
- If the conversion is successful(string to float), the program will display error message for None.
- If a ValueError occurs (invalid number), the program will display an error message.
### Sample 1:
Input
Output

```
45.67
```

```
Please enter a string or numeric value
```

### Sample 2:
Input
Output

```
abc123
```

```
Error: Invalid number format
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:08:22.832Z  

```java
import java.util.Scanner;

 class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Take user input
            String userInput = scanner.nextLine();

            // Try converting to float
            float result1 = Float.parseFloat(userInput);

            // Try converting null to float (this will cause NullPointerException)
            String nullValue = null;
            float result2 = Float.parseFloat(nullValue);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (NullPointerException e) {
            System.out.println("Please enter a string or numeric value");
        }

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JAVATC08)