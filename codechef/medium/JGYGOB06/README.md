# JGYGOB06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Display Laptop Info Using Inheritance

You are given a partially written Java program that uses  **inheritance**  to represent different types of laptops.

There is a parent class called `Laptop` which contains a method `laptopInfo()` that prints a general message about laptops. You need to create two child classes: `GamingLaptop` and `BusinessLaptop`, each with their own unique method.

 **Tasks:** 

- Create a class Laptop with a method: void laptopInfo() { System.out.println("This is a general laptop"); }
- Create a class GamingLaptop that extends Laptop and includes a method: void gamingFeatures() { System.out.println("Gaming Laptop has high-end graphics"); }
- Create a class BusinessLaptop that extends Laptop and includes a method: void businessFeatures() { System.out.println("Business Laptop has long battery life"); }
- In the main() method: Create an object of GamingLaptop and call both laptopInfo() and gamingFeatures() Create an object of BusinessLaptop and call both laptopInfo() and businessFeatures()

 **Hint:**  Use the  **extends**  keyword to inherit from the `Laptop` class. You don’t need to use any constructors or input in this problem.

 **Expected Output** 

```
This is a general laptop
Gaming Laptop has high-end graphics
This is a general laptop
Business Laptop has long battery life

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T05:48:36.331Z  

```java
class Laptop {
    void laptopInfo() {
        System.out.println("This is a general laptop");
    }
}

class GamingLaptop extends Laptop {
    void gamingFeatures() {
        System.out.println("Gaming Laptop has high-end graphics");
    }
}

class BusinessLaptop extends Laptop {
    void businessFeatures() {
        System.out.println("Business Laptop has long battery life");
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an object of GamingLaptop
        GamingLaptop gaming = new GamingLaptop();
        gaming.laptopInfo();
        gaming.gamingFeatures();

        // Create an object of BusinessLaptop
        BusinessLaptop business = new BusinessLaptop();
        business.laptopInfo();
        business.businessFeatures();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JGYGOB06)