# HDHCEH08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Creating an object for Book class
- Previously, you worked on the Rectangle class. Now, let's work on a Book class.
- First, we are creating a Book class, and then a book1 object is created for it.
- Two data members are also added to the class:

```
   String name;
   int pages;

```

- Try to complete the given code.

 **Once your code is executed, the output should look as follows:** 

```
Name of book is Java for Dummies
Total pages in book are 1032

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:23:37.881Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/HDHCEH08)