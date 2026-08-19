# JGYGOB09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Vehicle Info Displayer

Write a Java program with a base class `Vehicle` and a subclass `Car`.The subclass should call the parent constructor and method using `super()`, then print an additional message.

 **Steps to Follow:** 

- Create a class Vehicle with a constructor and a method displayType().
- Create a class Car that extends Vehicle and uses super() to call the parent constructor and method.
- Add a message in Car to print "It has four wheels."
- In the main() method, create a Car object and call the method to display both messages.

 **Expected Output:** 

```
This is a Car
It has four wheels.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:49:08.972Z  

```java
// Base class
class Vehicle {
    String type;

    // Constructor to set vehicle type
    Vehicle(String type) {
        this.type = type;
    }

    // Method to display vehicle type
    void displayType() {
        System.out.println("This is a " + type);
    }
}

// Child class that inherits from Vehicle
class Car extends Vehicle {

    // Constructor calling parent constructor using super()
    Car(String type) {
        super(type);
    }

    // Method to display full car info using inherited and custom behavior
    void showInfo() {
        super.displayType();  // Call method from parent class
        System.out.println("It has four wheels.");
    }
}

// Main class
class Codechef {
    public static void main(String[] args) {
        Car car = new Car("Car");   // Create object of Car
        car.showInfo();             // Display vehicle info
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JGYGOB09)