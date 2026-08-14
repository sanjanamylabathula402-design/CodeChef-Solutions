# HDHCEH04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Creating a user class

You've already learned how to define a  **class**  in Java and understood its basic structure. Now, let’s quickly test your understanding with a simple question:

Try to identify the correct way to create a class in Java.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:21:23.165Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;

class Employee{
    String name;
    int empID; 
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// create a book1 object of the Book class here
        Employee emp1 = new Employee();
        emp1.name = "Chef";
        emp1.empID = 5000;
        System.out.println("Name of employee is "+ emp1.name + " and his employee ID is " + emp1.empID);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/HDHCEH04)