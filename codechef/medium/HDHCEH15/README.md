# HDHCEH15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create a `Dog` object
- To hammer it home, there's another practice problem on (.) Dot operator for you. In this problem, you are given a Dog class. This class will serve as the blueprint for Dog objects. Let's say a Dog has a name (String) and a breed (String).

```
class Dog {
    String name;
    String breed;
}

```

- Now, your task is to create a Dog object using the new keyword inside the main method. Then, you have to assign values for both name and breed using (.) Dot operator. At last, print the result.

 **Expected Output** 

```
Breed: pug
Name: bob

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:40:21.465Z  

```java
class Dog{
    String breed;
    String name;
}

class Codechef {
    public static void main(String[] args) {
        // Create an object for Dog class here 
        Dog doggy=new Dog();
        
        // assign values for breed and name, breed is "pug" and name is "bob"
        doggy.breed="pug";
        doggy.name="bob";
        
        // print the result
        System.out.println("Breed: " + doggy.breed);
        System.out.println("Name: " + doggy.name);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/HDHCEH15)