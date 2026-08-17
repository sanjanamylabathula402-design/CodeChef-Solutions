# ZWFPSZ34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Registration Form

In this example, we demonstrate how to collect and store student details using Java’s `Scanner` class. This program gathers multiple inputs, including name (`String`), GPA (`double`), and enrollment status (`boolean`).

### Sample 1:
Input
Output

```
Alice Smith  
3.75  
true 
```

```
Student Profile:
Name: Alice Smith
GPA: 3.75
Currently Enrolled: true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:22:06.292Z  

```java
import java.util.Scanner; // Import the Scanner class to handle user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Collecting student's name
        String name = scanner.nextLine(); // Read the name (String)

        // Collecting student's GPA
        double gpa = scanner.nextDouble(); // Read the GPA (double)

        // Read enrollment status (boolean)
        boolean isEnrolled = scanner.nextBoolean(); 

        // Display the collected student profile
        System.out.println("\nStudent Profile:");
        System.out.println("Name: " + name); // Display the name
        System.out.println("GPA: " + gpa); // Display the GPA
        System.out.println("Currently Enrolled: " + isEnrolled); // Display enrollment status

        // Close the Scanner object to release system resources
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ34)