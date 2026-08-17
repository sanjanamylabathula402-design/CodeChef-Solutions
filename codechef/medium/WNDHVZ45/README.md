# WNDHVZ45

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check Password Strength

Write a program that grants access to a restricted system only if the entered password matches the stored password and the user's security clearance level is 3 or higher.

 **Input:** 

- A string representing the entered password.
- An integer representing the user's security clearance level.

 **Hint:**  To compare two strings, use the.equals() method instead of the == operator (== compares both the value and the memory address where they are stored).

### Sample 1:
Input
Output

```
Secure123
4
```

```
Access granted.
Security check completed.

```

### Sample 2:
Input
Output

```
WrongPass
4
```

```
Access denied.
Security check completed.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:59:33.334Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        String storedPassword = "Secure123";
        int requiredClearance = 3;

        Scanner scanner = new Scanner(System.in);

        // Taking user input
        String enteredPassword = scanner.next();
        int clearanceLevel = scanner.nextInt();

        // Checking access conditions
        if (enteredPassword.equals(storedPassword) && clearanceLevel >= requiredClearance) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }

        System.out.println("Security check completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ45)