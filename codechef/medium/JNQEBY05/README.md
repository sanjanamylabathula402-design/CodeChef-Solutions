# JNQEBY05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Customer Discount System

Write a program to declare and initialize a customer’s name and purchase amount using a default constructor. The program should create two customer objects, update the second one’s details, and use a loop with an if condition to determine and display their discount category.

 **Discount Criteria:** 

- Gold: Purchase amount > 5000
- Silver: 2000 ≤ Purchase amount ≤ 5000
- Bronze: Purchase amount < 2000
- Invalid: Purchase amount < 0

 **Expected Output:** 

```
Customer 1 Info:
Customer Name: Alice
Purchase Amount: 6000.0
Discount: Gold

Customer 2 Info:
Customer Name: Bob
Purchase Amount: 3000.0
Discount: Silver

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:45:19.071Z  

```java
class Customer {
    String name;
    double purchaseAmount;

    // Default constructor
    Customer() {
        // Initialize default values
        name = "Alice";
        purchaseAmount = 6000.0;
    }

    // Method to display customer info and determine discount category
    void showInfo() {
        // Display the customer's name and purchase amount
        System.out.println("Customer Name: " + name);
        System.out.println("Purchase Amount: " + purchaseAmount);

        // Handling invalid purchase amounts and determining discount category
        if (purchaseAmount < 0) {
            System.out.println("Error: Invalid purchase amount!");
        } else if (purchaseAmount > 5000) {
            System.out.println("Discount: Gold");
        } else if (purchaseAmount >= 2000) {
            System.out.println("Discount: Silver");
        } else {
            System.out.println("Discount: Bronze");
        }
        System.out.println();  // Empty line for clarity
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create two objects of Customer class
        Customer customer1 = new Customer();  // Default constructor will be called for customer1
        Customer customer2 = new Customer();  // Default constructor will be called for customer2

        // Manually set different values for customer2
        customer2.name = "Bob";
        customer2.purchaseAmount = 3000.0;

        // Display content of both the objects
        System.out.println("Customer 1 Info:");
        customer1.showInfo();  // Displays Alice's info and discount category

        System.out.println("Customer 2 Info:");
        customer2.showInfo();  // Displays Bob's info and discount category
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JNQEBY05)