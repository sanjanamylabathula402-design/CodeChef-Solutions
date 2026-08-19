class Car {
    // Instance variables (fields) for make, model, and year
    String make;  // Default value is null
    String model; // Default value is null
    int year;     // Default value is 0

    public void displayInfo() {
        // Print the values of instance variables
        System.out.println("Make: " + make);   // Prints the value of 'make'
        System.out.println("Model: " + model); // Prints the value of 'model'
        System.out.println("Year: " + year);   // Prints the value of 'year'
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car car = new Car();  // Object creation without explicitly setting field values
        
        // Display car details using the displayInfo method
        car.displayInfo();  // Calling the method to display information
    }
}
