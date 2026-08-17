# WNDHVZ14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Verifying Secret Code

A company assigns a  **secret code**  to unlock its secure vault. The system checks whether the entered secret code matches the predefined  **access code**. Complete the program by filling in the missing parts to ensure the correct functionality.

### Sample 1:
Input
Output

```
7890
```

```
Access Granted: Vault Unlocked.  
Verification completed.
```

### Sample 2:
Input
Output

```
7880
```

```
Access Denied 
Verification completed.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:33:22.714Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Declaring a variable to store the secret code
        int secretCode = 7890;
        
        Scanner sc = new Scanner(System.in);
        int enteredCode=sc.nextInt();
        
        // Checking if the enteredCode code matches the predefined secretCode
        if ( enteredCode==secretCode ) {  // Fill in the blank
            System.out.println("Access Granted: Vault Unlocked."); // Fill in the blank
        } else {
            System.out.println("Access Denied"); // Fill in the blank
        }

        // Indicating that the verification process is complete
        System.out.println("Verification completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ14)