# JNQEBY03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Constructors Basics and Default

In this example, we will demonstrate how to use a `default constructor` to initialize the properties of a Codechef object. The constructor will set predefined values for the participant's `name` and `age`.

 **Expected Output:** 

```
Name: John Doe  
Age: 20

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:44:50.346Z  

```java
class Codechef {
    // Instance variables for name and age
    String name;
    int age;

    // Default constructor to initialize name and age with predefined values
    Codechef() {
        name = "John Doe";  // Default name for the participant
        age = 20;           // Default age for the participant
    }

    public static void main(String[] args) {
        // Creating an object of Codechef class
        // The default constructor is automatically called here
        Codechef participant = new Codechef();

        // Printing the participant's details
        System.out.println("Name: " + participant.name);
        System.out.println("Age: " + participant.age);
    }
}




```

---

[View on CodeChef](https://www.codechef.com/problems/JNQEBY03)