# HDHCEH09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Valid object name

When you write the syntax  **className objectName = new className()**  for an  **object**, you use the  **new**  keyword before  **className**. What is the use of the  **new**  keyword?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:25:28.097Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;

// Book class 
class Book{
    String name;
    int pages;
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// book1 object of the Book class is created here
        Book book1 = new Book();
        book1.name = "Java for Dummies";
        book1.pages = 1032;
        System.out.println("Name of book is "+ book1.name);
        System.out.println("Total pages in book are "+ book1.pages);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/HDHCEH09)