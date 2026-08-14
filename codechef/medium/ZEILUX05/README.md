# ZEILUX05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Animal Sounds

Let's explore  **dynamic binding**  with animal sounds! You are given a base class called `Animal` with a method called `makeSound()` and two subclasses: `Dog` and `Cat`. Each overrides the `makeSound()` method to produce its specific sound. For now there's no need to bother about overriding we'll disucss it soon focus on binding part.

 **Task to perform:** 

- In main function you are given two references of Dog and Cat class which means they will be implemented at compile time using static binding.
- Now create two references of Animal class dogAnimal and catAnimal and in dogAnimal reference create a new Dog object and in catAnimal reference create a new Cat object.

 **NOTE:**  As for `Animal` class there are three `makeSound` methods one default and other two overridden so compile time binding is not possible.

 **Output format:** 

```
sound of dog :Woof!
sound of cat :Meow!
sound of dogAnimal :Generic animal sound!
sound of catAnimal :Generic animal sound!

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T09:19:29.653Z  

```java
class Animal {
    public String makeSound() {
        return "Generic animal sound!";
    }
}

class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof!";
    }
}

class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow!";
    }
}

public class Main {
    public static void main(String[] args) {
        // static bindings
        Dog dog = new Dog();  // This reference will be statically bound
        Cat cat = new Cat();  // This reference will be statically bound
        // Initialize an Animal reference and store a new Dog object in it    
     // This reference will be dynamically bound
        Animal dogAnimal = new Animal();
        // Initialize an Animal reference and store a new Cat object in it    
        Animal catAnimal = new Animal();  // This reference will be dynamically bound
        
        System.out.println("sound of dog :" + dog.makeSound());
        System.out.println("sound of cat :" + cat.makeSound());
        System.out.println("sound of dogAnimal :" + dogAnimal.makeSound());
        System.out.println("sound of catAnimal :" + catAnimal.makeSound());
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZEILUX05)