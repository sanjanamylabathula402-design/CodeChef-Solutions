# PWTIEX26

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Library Information Display

Write a program that prompts the user to enter the library name, the number of books, and the library address. Then, use a method with no parameters and no return type to display the entered information.

 **Tasks:** 

- Create a method displayLibraryInfo() that: Has no return type (void). Takes no parameters. Prompt the user to enter the library name, number of books, and address. Displays the library name, number of books, and address.
- In the main() method: Call displayLibraryInfo() to display the entered information.
### Sample 1:
Input
Output

```
Central Library
5000
Main Street
```

```
Library Information:
Library Name: Central Library
Number of Books: 5000
Library Address: Main Street
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:36:27.653Z  

```java
import java.util.Scanner;

class Codechef {

    // Method without parameters and return type
    public static void displayLibraryInfo() {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        String libraryName = scanner.nextLine();
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();  // consume the newline character left by nextInt()
        String libraryAddress = scanner.nextLine();

        // Displaying the library information
        System.out.println("Library Information:");
        System.out.println("Library Name: " + libraryName);
        System.out.println("Number of Books: " + numberOfBooks);
        System.out.println("Library Address: " + libraryAddress);
    }

    public static void main(String[] args) {
        // Calling the method to display library information
        displayLibraryInfo();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PWTIEX26)