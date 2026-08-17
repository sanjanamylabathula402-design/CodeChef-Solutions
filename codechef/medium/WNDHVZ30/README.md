# WNDHVZ30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Daily Water Intake Check

Write a program that takes the amount of water a person drank in the morning and the amount they drank in the evening. The program calculates the total daily water intake and checks if it is less than `2000` ml, which means the person needs to drink more water to stay hydrated.

 **Input:** 

- A single integer representing the amount of water consumed in the morning (in ml).
- A single integer representing the amount of water consumed in the evening (in ml).

Run the code with different values to check if you're drinking enough water!

### Sample 1:
Input
Output

```
800
900
```

```
You need to drink more water to stay hydrated!

```

### Sample 2:
Input
Output

```
1200
1000
```

```
Great job! You have met your daily water intake goal!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:56:12.073Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for morning and evening water intake
        int morningWater = scanner.nextInt();
        
        int eveningWater = scanner.nextInt();
        
        // Calculating total water intake
        int totalWater = morningWater + eveningWater;

        // Checking if total intake is less than 2000 ml
        if (totalWater < 2000) {
            System.out.println("You need to drink more water to stay hydrated!");
        } else {
            System.out.println("Great job! You have met your daily water intake goal!");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ30)