// Parent class
class Shape {
    // Method to be overridden
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Child class 1
class Circle extends Shape {
    // Overriding draw() method
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Child class 2
class Rectangle extends Shape {
    // Overriding draw() method
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main class
class Codechef {
    public static void main(String[] args) {
        // Parent class reference holding child class objects

        Shape s1 = new Circle();     // Circle object
        Shape s2 = new Rectangle();  // Rectangle object

        // Calls the draw method based on actual object at runtime
        s1.draw();  
        s2.draw(); 
    }
}
