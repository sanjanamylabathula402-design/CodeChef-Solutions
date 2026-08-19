import java.util.*;

class Codechef {

    // Declare instance variables for length and width
    double length;
    double width;

    // Parameterized constructor to initialize length and width
    public Codechef(double len, double wid) {
        length = len;
        width = wid;
    }

    // Method to calculate and display the area of the rectangle
    public void displayArea() {
        double area = length * width;  // Formula to calculate area of rectangle
        System.out.println("Rectangle Area: " + area);  // Print the area
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input for length and width
        double len = scanner.nextDouble();
        double wid = scanner.nextDouble();
        
        // Create an object of Codechef class using the parameterized constructor
        Codechef rectangle = new Codechef(len, wid);
        
        // Call the displayArea method to display the area of the rectangle
        rectangle.displayArea();
        
        scanner.close();
    }
}

