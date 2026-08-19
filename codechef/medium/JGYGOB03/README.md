# JGYGOB03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Inheriting with extends

In this example, we demonstrate how inheritance in Java allows a class to reuse code from another class using the `extends` keyword. The class `Car` inherits from `Vehicle`, gaining access to its methods and variables. The subclass also adds its own specific behavior.

 **When executed, the code will show:** 

```
Engine started.
Speed: 60 km/h
Car brand: Toyota

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:47:59.779Z  

```java
// Base class with shared behavior
class Vehicle {
    int speed = 60;

    void displaySpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }

    void startEngine() {
        System.out.println("Engine started.");
    }
}

// Subclass using 'extends' to inherit from Vehicle
class Car extends Vehicle {
    String brand = "Toyota";

    void showBrand() {
        System.out.println("Car brand: " + brand);
    }
}

// Main class to test inheritance
class Codechef {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.startEngine();     // Inherited method
        myCar.displaySpeed();    // Inherited method
        myCar.showBrand();       // Subclass-specific method
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JGYGOB03)