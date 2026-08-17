# WNDHVZ03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Checking Water Temperature

In this example, we demonstrate how to use an `if` statement to check whether the temperature of water has reached or exceeded its  **boiling point**. This method helps in understanding conditional execution in Java.

 **When executed, the code will show:** 

```
The water is boiling!  
Temperature check completed.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:31:24.442Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        int temperature = 102; // Example temperature

        // Check if the temperature is 100 or higher
        if (temperature >= 100) {
            // Print message if the water is boiling
            System.out.println("The water is boiling!");
        }

        // Print message indicating the completion of the temperature check
        System.out.println("Temperature check completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ03)