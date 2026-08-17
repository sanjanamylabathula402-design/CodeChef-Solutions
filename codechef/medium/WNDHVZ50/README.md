# WNDHVZ50

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Movie Night Eligibility Checker

Write a program that checks if a package qualifies for same-day delivery based on two conditions: whether the destination is within the city `OR` the order was placed before `2` PM. The program should take user input for both factors and determine if the package meets the criteria.

 **Input:** 

- A boolean (true or false) indicating whether the destination is within the city.
- An integer representing the order time in 24-hour format.
### Sample 1:
Input
Output

```
true  
15  

```

```
Package qualifies for same-day delivery.

```

### Sample 2:
Input
Output

```
false  
16  

```

```
Package does not qualify for same-day delivery.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:00:19.999Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for delivery conditions
        boolean isWithinCity = scanner.nextBoolean();
        int orderTime = scanner.nextInt();

        // Checking eligibility for same-day delivery
        if (isWithinCity || orderTime < 14) {
            System.out.println("Package qualifies for same-day delivery.");
        } else {
            System.out.println("Package does not qualify for same-day delivery.");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ50)