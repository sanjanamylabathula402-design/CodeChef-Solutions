# POOWVO15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### PIN Verification

A PIN verification system prompts the user until they enter the correct PIN.
The program uses a  **flag-controlled loop**  to repeatedly check user input before granting access.

 **Steps to Complete:** 

- Use a while loop to keep asking for input until the correct PIN is entered.
- Compare the entered PIN with the stored PIN.
- If the PIN matches, update the flag and print "Access granted!".
- If incorrect, display "Invalid PIN. Try again." and prompt the user again.
### Sample 1:
Input
Output

```
1111
9999
1234
```

```
Invalid PIN. Try again.  
Invalid PIN. Try again.  
Access granted!
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:29:34.269Z  

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

[View on CodeChef](https://www.codechef.com/problems/POOWVO15)