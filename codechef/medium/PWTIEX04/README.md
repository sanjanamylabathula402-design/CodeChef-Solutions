# PWTIEX04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create a Student class

We have given you the partial code to create a class named Student. You have to complete the class definition and implement the required method to display the student's information.

 **Tasks:** 

- Inside the class, declare three fields: name of type String age of type int grade of type char
- Create a method named displayInfo() that prints the student's information in a readable format.

 **Expected Output** 

```
Student Name: Alice
Age: 15
Grade: A

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:38:36.469Z  

```java
// Create your Student class here
class Student {
    // Step 1: Declare fields
    String name;
    int age;
    char grade;

    // Step 2: Create method to display student information
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

//---------------------

class Main {
    public static void main(String[] args) {
        // Create a Student object and assign values
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 15;
        student1.grade = 'A';
        
        // Call the displayInfo method to print student details
        student1.displayInfo();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX04)