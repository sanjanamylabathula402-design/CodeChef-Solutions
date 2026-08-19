# JNQEBY16

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Rectangle Area Calculator using Constructor

Write a program to store the dimensions (`length` and `width`) of a rectangle. Use a `parameterized constructor` to initialize the dimensions when the object is created. After initializing the rectangle's dimensions, calculate and print the `area` of the rectangle.

 **Input:** 

Two double values representing the length and width of the rectangle.

Run the code, modify values, and observe how the rectangle's area is calculated and displayed!

### Sample 1:
Input
Output

```
12.0
14.0

```

```
Rectangle Area: 168.0

```

### Sample 2:
Input
Output

```
5.0
6.0
```

```
Rectangle Area: 30.0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:46:28.554Z  

```java
import java.util.*;

class Codechef {

    // Declare instance variables for length and width
    double length;
    double width;

    // Parameterized constructor to initialize length and width
    public Codechef(double len, double wid) {
        length = len;
        width = wid;
    }

    // Method to calculate and display the area of the rectangle
    public void displayArea() {
        double area = length * width;  // Formula to calculate area of rectangle
        System.out.println("Rectangle Area: " + area);  // Print the area
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input for length and width
        double len = scanner.nextDouble();
        double wid = scanner.nextDouble();
        
        // Create an object of Codechef class using the parameterized constructor
        Codechef rectangle = new Codechef(len, wid);
        
        // Call the displayArea method to display the area of the rectangle
        rectangle.displayArea();
        
        scanner.close();
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/JNQEBY16)