# JNQEBY20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simple Interest Calculator

Write a program to calculate Simple Interest using a parameterized constructor. The program should store the principal amount, rate of interest, and time duration. Use a loop to take input for these values dynamically and compute the Simple Interest using the given formula:

 **Simple Interest = (Principal × Rate × Time) / 100** 

 **Input:** 
Three double values representing Principal Amount (P), Rate of Interest (R), and Time (T) in years.

### Sample 1:
Input
Output

```
1000  
5  
2  

```

```
Simple Interest: 100.0

```

### Sample 2:
Input
Output

```
5000  
3.5  
4  

```

```
Simple Interest: 700.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:47:31.214Z  

```java
import java.util.Scanner;

class Codechef {
    double principal, rate, time;

    // Constructor using 'this' keyword
    public Codechef(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    // Method to calculate and return Simple Interest
    public double calculateInterest() {
        return (this.principal * this.rate * this.time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[3];  // Array to store principal, rate, and time

        // Loop to take inputs dynamically
        for (int i = 0; i < 3; i++) {
            values[i] = scanner.nextDouble();
        }

        // Creating Codechef object
        Codechef sic = new Codechef(values[0], values[1], values[2]);

        // Printing calculated Simple Interest
        System.out.println("Simple Interest: " + sic.calculateInterest());

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JNQEBY20)