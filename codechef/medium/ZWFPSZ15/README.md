# ZWFPSZ15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create a Simple User Profile

Write a program to take user input for a username, a short biography, and the initial of their favorite color using Java’s Scanner class. The program will demonstrate reading different types of input effectively.

 **Steps to Complete:** 

- Read a single-word username using next().
- Use nextLine() to read a full-line biography while handling input buffer issues.
- Capture a single character representing the user's favorite color initial.
- Display the user's profile information.
### Sample 1:
Input
Output

```
Alex  
Passionate about coding and AI.  
B 
```

```
User Profile:  
Username: Alex  
Bio: Passionate about coding and AI.  
Favorite Color Initial: B  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:21:03.486Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their username (a single word)
        String username = scanner.next();

        // Consume the leftover newline character from the input buffer after the previous input
        scanner.nextLine(); 

        // Prompt the user to enter a biography (a full line, possibly containing spaces)
        String bio = scanner.nextLine(); 

        // Prompt the user to enter the initial of their favorite color
        char colorInitial = scanner.next().charAt(0); 

        // Display the user's profile information
        System.out.println("User Profile:");
        System.out.println("Username: " + username);
        System.out.println("Bio: " + bio); 
        System.out.println("Favorite Color Initial: " + colorInitial); 

        // Close the Scanner object to release system resources
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ15)