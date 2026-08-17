# RESUFF23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check Admission Criteria

In this example, we demonstrate how to use an  **if-else statement**  to check if a student is eligible for admission based on their  **academic percentage, entrance exam score, and participation in extracurricular activities**. This method helps in understanding conditional execution in Java.

 **When executed, the code will show:** 

```
Eligible for admission.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T10:05:04.890Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/RESUFF23)