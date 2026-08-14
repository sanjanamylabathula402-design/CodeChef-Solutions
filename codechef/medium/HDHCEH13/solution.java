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
