# JGYGOB04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Choose the Correct Output

What will be the output of the following Java program?

```
class Animal {
    void animalSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void dogSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void catSound() {
        System.out.println("Cat meows");
    }
}

class Codechef {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.dogSound();
        c.catSound();
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:48:10.845Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/JGYGOB04)