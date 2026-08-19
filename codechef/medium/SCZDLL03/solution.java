import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor with validation
    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    // Getter method
    public double getRadius() {
        return radius;
    }
}

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextDouble()) {
            double r = scanner.nextDouble();
            
            try {
                // Attempting to create a Circle object
                Circle c = new Circle(r);
                System.out.println("Circle created with radius: " + c.getRadius());
            } catch (IllegalArgumentException e) {
                // Catching the exception if radius is invalid
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
    }
}