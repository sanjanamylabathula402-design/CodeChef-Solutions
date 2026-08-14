# HDHCEH11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Define a Car class
- Great! You've worked on a Rectangle class and a Book class. Now, let's try another one, but this time you will be writing the code from the beginning.
- Your task is to write the code to define a Car class with two variables: brand and model.
- Here's how you would declare variables:

```
    String brand;
    int model;

```

 **Once your code is executed, the output should look as follows:** 

```
The car is from Toyota brand and its model is 2021

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:29:20.690Z  

```java
// create your Car class here
class Car{
    String brand ;
    int model;
}
class Codechef{
    public static void main(String[] args) {
        // create a new_car object for the Car class  
       Car new_car =new Car();

        new_car.brand = "Toyota";
        new_car.model = 2021;
    
        System.out.println("The car is from "+ new_car.brand + " brand " + "and its model is "+ new_car.model);
    }

}
```

---

[View on CodeChef](https://www.codechef.com/problems/HDHCEH11)