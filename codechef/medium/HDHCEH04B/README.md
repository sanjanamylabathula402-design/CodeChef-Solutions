# HDHCEH04B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Creating Rectangle class

You've already learned how to define a  **class**  in Java and understood its basic structure. Now, let’s quickly test your understanding with a simple question:

- Try to debug this code for creating a Rectangle class.
- Don't bother about instance variables, methods, and object creation for now.
- Just focus on the class declaration part.

 **Once your code is executed, your output should look as follows:** 

```
Area of the rectangle is 28

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:21:59.281Z  

```java
class Rectangle {
    // instance variables length and width
    int length;
    int width;
    // Method to calculate area
    int area (){
        return length*width;
    }
}

public class Main {
    public static void main(String[] args) {
        // object creation for rectangle class
        Rectangle rect1 = new Rectangle();
        rect1.length = 7;
        rect1.width = 4;
        System.out.println("Area of the rectangle is "+ rect1.area());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HDHCEH04B)