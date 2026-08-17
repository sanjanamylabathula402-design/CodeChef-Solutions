# CTMNMF04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Secure Login System

You are creating a basic login check. The system should keep checking the password until it matches the correct one.

 **Your Task:** 
Write the condition for while loop.

 **Expected Output:** 

```
Access Granted!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:19:32.387Z  

```java
class Codechef {
    public static void main(String[] args) {

        String correctPassword = "JavaRocks";
        String enteredPassword = "JavaRocks";

        // Write the condition below in the while loop
        while (!enteredPassword.equals(correctPassword) ) {
            System.out.println("Invalid Password");

        }

        System.out.println("Access Granted!");

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CTMNMF04)