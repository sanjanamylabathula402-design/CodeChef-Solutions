# RESUFF24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Checking for Promotion Eligibility

You are checking if a user is eligible for a special promotion. The user is eligible if they are  **18 or older**  AND they have a  **premium account**  OR if they are an  **admin**. Given the following conditions:

```
class Codechef {
    public static void main(String[] args) {
        int age = 20; 
        boolean hasPremium = true; 
        boolean isAdmin = false; 

        if ((age >= 18 && hasPremium) || isAdmin) {
            System.out.println("Eligible for promotion"); 
        } else {
            System.out.println("Not eligible for promotion"); 
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:05:26.167Z  

```cpp
class Codechef {
    public static void main(String[] args) {
        
        double percentage = 85.5; 
        int entranceScore = 75;
        boolean extracurricular = true;

        // Use an 'if-else' statement to check the eligibility criteria for admission
        // Check if all conditions are met: percentage >= 85, entranceScore >= 70, and extracurricular participation is true
        if (percentage >= 85 && entranceScore >= 70 && extracurricular) {
            System.out.println("Eligible for admission."); // Print this message if all conditions are satisfied
        } else {
            System.out.println("Not eligible for admission."); // Print this message if any condition is not satisfied
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/RESUFF24)