# HDHCEH03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked example
- Now that you have understood the theoretical concept and syntax of a class, it's time to understand an actual code example for a class.
- Read this code and try to understand the way to define a class. Don't stress too much about instance variables, methods, and object creation for now; they will be discussed in depth later. For now, just focus on declaring a class.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:20:53.830Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/HDHCEH03)