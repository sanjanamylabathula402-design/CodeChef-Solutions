# SCZDLL04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Validating a Circle Object

Let's solidify your understanding of  **validating object creation**  with a worked-out example. We're creating a `Circle`  **class**  and ensuring that a circle can only be created with a positive radius.

 **Working of example:** 

- This program demonstrates object creation with validation using exception handling.
- The Circle class has a private radius field and a constructor that throws an IllegalArgumentException if the radius is zero or negative, ensuring only valid circles are created.
- The getRadius method returns the radius value.
- In the Main class, Circle objects are created inside a try block. If an invalid radius is passed, the exception is caught, and an error message is displayed using the catch block. This ensures the program doesn't crash and handles invalid input gracefully.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T10:06:56.266Z  

```java
import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor with validation
    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    // Getter method
    public double getRadius() {
        return radius;
    }
}

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextDouble()) {
            double r = scanner.nextDouble();
            
            try {
                // Attempting to create a Circle object
                Circle c = new Circle(r);
                System.out.println("Circle created with radius: " + c.getRadius());
            } catch (IllegalArgumentException e) {
                // Catching the exception if radius is invalid
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SCZDLL04)