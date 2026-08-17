# RESUFF30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Weather Warning

Write a Program to Check  **Weather Warning Based on Warning Level**. This program takes a weather warning level as input and provides advice based on the severity using a switch statement. The program assigns messages as follows:

- Advisory for level 1.
- Watch for level 2.
- Warning for level 3.
- Print "Stay safe." for all warning levels.

 **Input:** 
A single  **integer**  representing the warning level (`1, 2, or 3`).

### Sample 1:
Input
Output

```
1
```

```
Advisory: Be cautious, weather may affect your plans.
Watch: Conditions may escalate, stay alert.
Warning: Severe weather expected, take precautions.
Stay safe.

```

### Sample 2:
Input
Output

```
2
```

```
Watch: Conditions may escalate, stay alert.
Warning: Severe weather expected, take precautions.
Stay safe.

```

### Sample 3:
Input
Output

```
3
```

```
Warning: Severe weather expected, take precautions.
Stay safe.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:06:23.466Z  

```java
import java.util.Scanner; // Import Scanner class to take input from the user

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in); 

         // Read user input and store it in the 'warningLevel' variable
        int warningLevel = scanner.nextInt();

        switch (warningLevel) {
            case 1: // Case for Advisory
                System.out.println("Advisory: Be cautious, weather may affect your plans.");
                // No 'break', so execution continues to the next case

            case 2: // Case for Watch
                System.out.println("Watch: Conditions may escalate, stay alert.");

            case 3: // Case for Warning
                System.out.println("Warning: Severe weather expected, take precautions.");

                System.out.println("Stay safe."); // Generic safety message
        }

        scanner.close(); // Close the Scanner object to release resources
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF30)