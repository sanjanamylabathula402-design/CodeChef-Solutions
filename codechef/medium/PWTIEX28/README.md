# PWTIEX28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example- Method Parameters and Return Types

In this example,the program will define a method to calculate the area of a rectangle. The method will accept the  **length**  and  **width**  as parameters and return the  **calculated area**. This will show how to work with method parameters and return types.

 **Expected Output:** 

```
The area of the rectangle is: 50.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:37:11.699Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/PWTIEX28)