# JNQEBY18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bank Account with this Keyword

In this example, we demonstrate how to use the `this keyword` to refer to a class's instance variables. A parameterized constructor initializes the account holder's `name` and `balance`, ensuring proper assignment. The object's attributes are then accessed and displayed concisely.

 **When executed, the code will show:** 

```
Account Holder: Alice
Account Balance: 1500.0 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:46:44.517Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/JNQEBY18)