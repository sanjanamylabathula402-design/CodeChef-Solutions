# HDHCEH08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:22:58.598Z  

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

[View on CodeChef](https://www.codechef.com/problems/HDHCEH08)