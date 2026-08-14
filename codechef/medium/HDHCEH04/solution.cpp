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
