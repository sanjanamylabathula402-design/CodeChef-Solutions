# WNDHVZ40

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Luggage Allowance Check

Write a program to check if a traveler's luggage meets the 20 kg weight limit. If it's within the limit (≤ 20 kg), it's allowed; otherwise, it exceeds the limit, and extra charges may apply. Also, calculate the excess weight using the (-) operator.

 **Input:** 
A single integer representing the weight of the luggage.

### Sample 1:
Input
Output

```
18
```

```
Your luggage is within the allowed limit.
Luggage check completed.

```

### Sample 2:
Input
Output

```
25
```

```
Your luggage exceeds the limit by 5 kg. Additional charges may apply.
Luggage check completed.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:58:54.346Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for luggage weight
        int luggageWeight = scanner.nextInt();

        // Defining the maximum allowed weight
        int maxWeight = 20;

        // Checking if the luggage meets the weight restriction
        if (luggageWeight <= maxWeight) {
            System.out.println("Your luggage is within the allowed limit.");
        } else {
            int excessWeight = luggageWeight - maxWeight;
            System.out.println("Your luggage exceeds the limit by " + excessWeight + " kg. Additional charges may apply.");
        }

        System.out.println("Luggage check completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ40)