# JGYGOB24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Identify the Line that Causes a Compilation Error

Which line in the below code will cause a compilation error?

```
class Stationery {
    void use() {
        System.out.println("Using stationery item");
    }
}

class Pen extends Stationery {
    void use() {
        System.out.println("Writing with a pen");
    }
}

class Codechef {
    public static void main(String[] args) {
        Stationery s1 = new Pen();   
        s1.use(); 
                   
        Stationery s2 = new Stationery();   
        Pen p = s2; 
        p.use();                     
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:49:44.953Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/JGYGOB24)