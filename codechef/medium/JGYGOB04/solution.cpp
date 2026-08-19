// Base class with shared behavior
class Vehicle {
    int speed = 60;

    void displaySpeed() {
        System.out.println("Speed: " + speed + " km/h");
    }

    void startEngine() {
        System.out.println("Engine started.");
    }
}

// Subclass using 'extends' to inherit from Vehicle
class Car extends Vehicle {
    String brand = "Toyota";

    void showBrand() {
        System.out.println("Car brand: " + brand);
    }
}

// Main class to test inheritance
class Codechef {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.startEngine();     // Inherited method
        myCar.displaySpeed();    // Inherited method
        myCar.showBrand();       // Subclass-specific method
    }
}