# PWTIEX14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Instance Variables in Java - Output Based Question

What will be the output of the following code, which demonstrates the usage of instance variables in Java?

```
class Student {
    String name = "John";  // Instance variable
    int age = 26; // Instance variable

    public void display() {
        System.out.println(name); 
    }
}

class Codechef {
    public static void main(String[] args) {
        Student student1 = new Student(); 
        Student student2 = new Student(); 

        student1.display(); 
        student2.age();  
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:40:03.057Z  

```cpp
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