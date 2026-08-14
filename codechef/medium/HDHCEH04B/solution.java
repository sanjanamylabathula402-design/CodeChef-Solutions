class Rectangle {
    // instance variables length and width
    int length;
    int width;
    // Method to calculate area
    int area (){
        return length*width;
    }
}

public class Main {
    public static void main(String[] args) {
        // object creation for rectangle class
        Rectangle rect1 = new Rectangle();
        rect1.length = 7;
        rect1.width = 4;
        System.out.println("Area of the rectangle is "+ rect1.area());
    }
}