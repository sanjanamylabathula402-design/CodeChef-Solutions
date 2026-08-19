# PWTIEX14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Instance Variables in Java

This example demonstrates how  **instance variables**  store unique data for each object in Java. Each student object has a unique  **ID**  and  **name**, stored as instance variables, ensuring that every object maintains its own data independently.

 **Expected Output:** 

```
Student 1: ID = 1, Name = Rahul  
Student 2: ID = 2, Name = Sneha  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:39:52.881Z  

```java
// Class representing a student using instance variables
class Codechef {
    // Step 1: Declare instance variables (fields)
    int studentId;  // Stores student ID
    String studentName;  // Stores student name

    public static void main(String[] args) {
        // Step 2: Create two student objects
        Codechef s1 = new Codechef();
        Codechef s2 = new Codechef();

        // Step 3: Assign values to instance variables for each object
        s1.studentId = 1;
        s1.studentName = "Rahul";

        s2.studentId = 2;
        s2.studentName = "Sneha";

        // Step 4: Display instance variable values for each student
        System.out.println("Student 1: ID = " + s1.studentId + ", Name = " + s1.studentName);
        System.out.println("Student 2: ID = " + s2.studentId + ", Name = " + s2.studentName);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX14)