# PWTIEX29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Method Overloading

What will be the output of the following code, considering method parameters and return types in Java?

```
class Calculator {
    public int add(int a, int b) {
        return a + b;  // Adding two integers and returning the result
    }

    public String add(String a, String b) {
        return a + b;  // Concatenating two strings and returning the result
    }
}

public class Codechef {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));      // Method with integer parameters
        System.out.println(calc.add("Hello", "World"));  // Method with string parameters
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:37:19.137Z  

```cpp
class Codechef {

    // Method with parameters and a return type
    // This method calculates the area of a rectangle
    // It takes two parameters: 'length' and 'width' (both of type double)
    // It returns the area of the rectangle (a double value)
    public static double calculateArea(double length, double width) {
        // Calculate area by multiplying length and width
        double area = length * width;
        
        // Return the calculated area
        return area;
    }

    public static void main(String[] args) {
        // Define the length and width of the rectangle
        double length = 10;
        double width = 5;
        
        // Call the calculateArea method and store the result
        double area = calculateArea(length, width);
        
        // Print the result (the area of the rectangle)
        System.out.println("The area of the rectangle is: " + area);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX29)