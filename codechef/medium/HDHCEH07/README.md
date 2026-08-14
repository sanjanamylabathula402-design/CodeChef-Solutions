# HDHCEH07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked example for objects
- Earlier you worked on classes, and now you have also understood how objects will be created for those classes. So, let's take the same Rectangle class we discussed earlier.
- Remember the syntax for object creation:

```
   className objectName = new ClassName()

```

- You can use this syntax to create as many objects as you want.
- In this example, we are creating two objects, rect1 and rect2; you can create even more than that.
- Run this code, and you will be able to see that both objects are completely independent from each other.

 **Executing your code will result in output that looks as follows:** 

```
Area of first rectangle is 45
Area of second rectangle is 39

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:22:46.230Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Rectangle{
    // instance variables
    int length;
    int width;
    // methods
    int area(){
        return length*width;
    }
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// objects for the class are created here
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		rect1.length = 5; rect1.width = 9;
		rect2.length = 13; rect2.width = 3;
		
		System.out.println("Area of first rectangle is "+ rect1.area());
		System.out.println("Area of second rectangle is "+ rect2.area());
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HDHCEH07)