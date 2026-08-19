// Base class
class Vehicle {
    String type;

    // Constructor to set vehicle type
    Vehicle(String type) {
        this.type = type;
    }

    // Method to display vehicle type
    void displayType() {
        System.out.println("This is a " + type);
    }
}

// Child class that inherits from Vehicle
class Car extends Vehicle {

    // Constructor calling parent constructor using super()
    Car(String type) {
        super(type);
    }

    // Method to display full car info using inherited and custom behavior
    void showInfo() {
        super.displayType();  // Call method from parent class
        System.out.println("It has four wheels.");
    }
}

// Main class
class Codechef {
    public static void main(String[] args) {
        Car car = new Car("Car");   // Create object of Car
        car.showInfo();             // Display vehicle info
    }
}