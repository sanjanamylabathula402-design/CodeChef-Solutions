# WNDHVZ48

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Library Late Fee Waiver

In this example, we demonstrate how to use an if-else statement with the logical || (OR) operator to check if a library late fee can be waived. This method helps in understanding multiple conditions using or in Java.

 **When executed, the code will show:** 

```
Your late fee is waived.  
Library fee check completed.  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:59:51.495Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Variables representing waiver conditions
        boolean isSeniorCitizen = false;
        boolean hasMembership = true;

        // Check if the user qualifies for a late fee waiver
        if (isSeniorCitizen || hasMembership) {
            System.out.println("Your late fee is waived.");
        } else {
            System.out.println("You need to pay the late fee.");
        }

        System.out.println("Library fee check completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ48)