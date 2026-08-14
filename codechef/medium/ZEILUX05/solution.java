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
