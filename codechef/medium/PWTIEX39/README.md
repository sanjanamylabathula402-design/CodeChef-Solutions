# PWTIEX39

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Output of Code with Object References & Assignment

What will be the output of the following code, considering object references and assignment behavior in Java?

```
class Person {
    String name;  // Instance variable
}

public class Codechef {
    public static void main(String[] args) {
        Person p1 = new Person();  // Create an object of Person class
        p1.name = "Alice";  // Assign value directly to instance variable

        Person p2 = p1;  // Assigning reference of p1 to p2
        p2.name = "Bob";  // Modifying the name of p2
        System.out.println(p1.name);  // What will be the output?
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:42:29.498Z  

```cpp
// The Book class defined here for reference assignment example
class Book {
    String title;
    String author;
    double price;
}


class Codechef {
    public static void main(String[] args) {
        // Creating the first Book object
        Book firstBook = new Book();
        firstBook.title = "Book of Justice";  // Initializing title
        firstBook.author = "J.K Nayak";       // Initializing author
        firstBook.price = 1299.0;             // Initializing price

        // Assigning the reference of firstBook to secondBook
        Book secondBook = firstBook;  // Object reference assignment

        // Modifying secondBook's details
        secondBook.title = "Book of Power";  // Changing the title
        secondBook.price = 1499.0;          // Changing the price

        // Displaying modified details through firstBook reference
        System.out.println("Modified Book Details:");
        System.out.println("Title: " + firstBook.title);   // Accessing through firstBook
        System.out.println("Author: " + firstBook.author); // Accessing through firstBook
        System.out.println("Price: " + firstBook.price);   // Accessing through firstBook
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX39)