# RESUFF19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simple Password Strength Checker
- A system evaluates password strength based on its length. The system checks whether the password meets the minimum length requirement using the ternary operator. Complete the program by filling in the missing parts to ensure it functions correctly.
- If the password length is less than 8 characters, print: "Password strength: Weak" Otherwise, print: "Password strength: Strong"

 **Expected Output:** 

```
Password strength: Strong

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:04:12.445Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Initialize the variable 'password' with a predefined value
        String password = "mypass123"; 

        // Use a ternary operator to evaluate the password strength
        // If the length of the password is less than 8 characters, it is "Weak"
        // Otherwise, the password is "Strong"
        String strength = password.length() < 8 ? "Weak" : "Strong";
        
        // Output the password strength to the console
        System.out.println("Password strength: " + strength);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF19)