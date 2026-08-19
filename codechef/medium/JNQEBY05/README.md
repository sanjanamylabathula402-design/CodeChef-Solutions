# JNQEBY05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Constructor Execution in Java

 **What will be the output of the following Java program?** 

```
class Demo {
    Demo() {
        System.out.println("Constructor Called");
    }
    
    void show() {
        System.out.println("Hello, Java!");
    }
}

 class Codechef {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:45:03.540Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/JNQEBY05)