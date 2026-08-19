# JGYGOB23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Method Overriding in Java

In this example, we demonstrate how  **runtime polymorphism**  works using  **method overriding**. We define a parent class `Shape` and two child classes `Circle` and `Rectangle`, each providing their own version of the `draw()` method.

 **When executed, the code will show:** 

```
Drawing a circle  
Drawing a rectangle

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:49:23.886Z  

```java
// Parent class
class Shape {
    // Method to be overridden
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class 1
class Circle extends Shape {
    // Overriding draw() method
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Child class 2
class Rectangle extends Shape {
    // Overriding draw() method
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class
class Codechef {
    public static void main(String[] args) {
        // Parent class reference holding child class objects

        Shape s1 = new Circle();     // Circle object
        Shape s2 = new Rectangle();  // Rectangle object

        // Calls the draw method based on actual object at runtime
        s1.draw();  
        s2.draw(); 
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JGYGOB23)