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
