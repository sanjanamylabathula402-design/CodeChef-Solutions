# WNDHVZ08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Checking Speed Limit

In this example, we demonstrate how to use an `if-else` statement to check whether a vehicle is exceeding the speed limit. This method helps in understanding conditional execution in Java.

 **When executed, the code will show:** 

```
You are overspeeding! Slow down.  
Speed check completed.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:32:21.182Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Declare an integer variable for speed
        int speed = 75;

        // Check if the speed exceeds the limit of 60
        if (speed > 60) {
            System.out.println("You are overspeeding! Slow down.");
        } else {
            System.out.println("You are within the speed limit.");
        }

        // Indicate that the speed check is completed
        System.out.println("Speed check completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ08)