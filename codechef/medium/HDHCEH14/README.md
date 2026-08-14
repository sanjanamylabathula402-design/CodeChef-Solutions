# HDHCEH14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked example dot operator
- If you have understood the theoretical concept of the (.) Dot operator, check this worked example; it will provide you with even more clarity.
- Read this code and try to understand the way the (.) Dot operator is used and its working.
- You can also try to make changes in this code to try different things.
- Submit the code and look at the output carefully.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:30:37.678Z  

```java
// Rectangle class defined
class Rectangle {
    int length;
    int width;
}

public class Main {
    public static void main(String[] args) {
        // Created a Rectangle object 
        Rectangle fig1 = new Rectangle();
        // Way  dot operator will be used for assigning values to data members for object
        fig1.length = 7;
        fig1.width = 6;
        // Way  dot operator will be used for acceessing values of data members for object
        System.out.println("Length : " + fig1.length);   
        System.out.println("Width : " + fig1.width);   
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HDHCEH14)