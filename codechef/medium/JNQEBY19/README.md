# JNQEBY19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Usage of this Keyword in Java

What will be the output of the following Java program?

```
class Codechef {
    String name;
    int age;

    // Constructor to set name and age
    Codechef(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // Create object with values
        Codechef person = new Codechef("Alice", 30);

        // First comparison (using == for demonstration)
        if (person.name == "Alice" && person.age == 30) {
            System.out.println("Details match!");
        } else {
            System.out.println("Details don't match!");
        }

        // Second comparison
        if (person.name == "Bob" && person.age == 25) {
            System.out.println("Details match!");
        } else {
            System.out.println("Details don't match!");
        }
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:47:16.306Z  

```cpp
class Codechef {
    // Instance variables for the account holder's name and balance
    String accountHolderName;
    double accountBalance;

    // Parameterized constructor to initialize name and balance using 'this' keyword
    public Codechef(String name, double balance) {
        this.accountHolderName = name;  // 'this' refers to the instance variable accountHolderName
        this.accountBalance = balance;  // 'this' refers to the instance variable accountBalance
    }

    public static void main(String[] args) {
        // Create an object of Codechef class with a parameterized constructor
        Codechef account = new Codechef("Alice", 1500.0);  // Initializing with name and balance
        
        // Display the account details directly inside main method
        System.out.println("Account Holder: " + account.accountHolderName);  // Accessing the name
        System.out.println("Account Balance: " + account.accountBalance);  // Accessing the balance
    }
}


```

---

[View on CodeChef](https://www.codechef.com/problems/JNQEBY19)