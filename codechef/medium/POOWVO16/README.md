# POOWVO16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:29:44.500Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int correctPIN = 1234;
        boolean isVerified = false; 
        while (!isVerified) {
            int userPIN = scanner.nextInt();
            if (userPIN == correctPIN) {
                isVerified = true; 
                System.out.println("Access granted!"); 
            } else {
                System.out.println("Invalid PIN. Try again."); 
            }
        }

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/POOWVO16)