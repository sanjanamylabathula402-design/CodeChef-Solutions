# WNDHVZ50

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Emergency Access Verification

A security system grants emergency access to a restricted area if either the  **emergency keycode**  is entered correctly or the  **override code**  is used. Complete the program by filling in the missing parts to ensure the correct functionality.

 **Input:** 
Take enteredCode as input.

### Sample 1:
Input
Output

```
4321
```

```
Access Granted: Emergency Entry Allowed.
```

### Sample 2:
Input
Output

```
9999
```

```
Access Granted: Emergency Entry Allowed.
```

### Sample 3:
Input
Output

```
1234
```

```
Access Denied: Invalid Code.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:00:09.134Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Predefined emergency access codes
        int emergencyKeycode = 4321;
        int overrideCode = 9999;

        Scanner sc= new Scanner(System.in);
        int enteredCode=sc.nextInt();
        
        // Checking if the entered code matches either emergencyKeycode or overrideCode
        if (enteredCode == emergencyKeycode || enteredCode == overrideCode) {
            System.out.println("Access Granted: Emergency Entry Allowed.");
        } else {
            System.out.println("Access Denied: Invalid Code.");
        }

    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ50)