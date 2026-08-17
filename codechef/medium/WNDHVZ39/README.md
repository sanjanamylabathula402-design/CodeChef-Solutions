# WNDHVZ39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:58:35.191Z  

```java
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking age input from the user
        int age = scanner.nextInt();
        
        int minSeniorAge = 60; // Minimum age required for discount
        
        // Checking eligibility for the discount
        if (age >= minSeniorAge) {
            System.out.println("You are eligible for a senior citizen discount!");
            System.out.println("Enjoy your discounted movie ticket.");
        } else {
            // Calculating how many more years are needed
            int yearsLeft = minSeniorAge - age;
            System.out.println("You are not eligible for a senior citizen discount.");
            System.out.println("You need to wait " + yearsLeft + " more years to qualify.");
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ39)