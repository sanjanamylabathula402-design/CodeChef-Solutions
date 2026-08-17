# RESUFF28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Meal Recommendations Based on Time

In this example, we demonstrate how to use a  **switch statement**  to determine the appropriate  **meal recommendation**  based on the time of day. The switch statement helps in providing different outputs depending on the value of the time variable.

 **When executed, the code will show:** 

```
Lunch is available from 12 PM to 3 PM.
Dinner is served from 6 PM to 9 PM.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:06:02.317Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Initialize the variable 'time' to represent the time of day
        // (1 for Breakfast, 2 for Lunch, 3 for Dinner)
        int time = 2; 

        // Use a switch statement to determine and print the meal recommendations
        switch (time) {
            case 1: // If 'time' equals 1
                System.out.println("Breakfast is served from 7 AM to 10 AM.");

            case 2: // If 'time' equals 2
                System.out.println("Lunch is available from 12 PM to 3 PM.");

            case 3: // If 'time' equals 3
                System.out.println("Dinner is served from 6 PM to 9 PM.");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF28)