# JGYGOB09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Using super Keyword

In this example, we demonstrate how inheritance in Java allows a subclass to reuse code from a parent class. The extends keyword is used to create the subclass, `super()` is used to call the parent class constructor, and `super.methodName()` is used to call a method from the parent class.

 **When executed, the code will show:** 

```
Person object created.
I am a person.
I am also a student.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:48:55.186Z  

```java
// Parent class
class Person {

    // Constructor of the parent class
    Person() {
        System.out.println("Person object created.");
    }

    // Method of the parent class
    void introduce() {
        System.out.println("I am a person.");
    }
}

// Subclass that inherits from Person
class Student extends Person {

    // Constructor of the subclass
    Student() {
        super(); // Calls the constructor of the parent class
    }

    // Method that includes both parent and child behavior
    void introduceStudent() {
        super.introduce(); // Calls the introduce() method from the parent class
        System.out.println("I am also a student.");
    }
}

// Main class to run the program
class Codechef {
    public static void main(String[] args) {
        Student s = new Student();     // Creates a Student object
        s.introduceStudent();          // Calls method to show full introduction
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JGYGOB09)