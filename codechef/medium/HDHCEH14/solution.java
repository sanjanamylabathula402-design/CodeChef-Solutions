// Rectangle class defined
class Rectangle {
    int length;
    int width;
}

public class Main {
    public static void main(String[] args) {
        // Created a Rectangle object 
        Rectangle fig1 = new Rectangle();
        // Way  dot operator will be used for assigning values to data members for object
        fig1.length = 7;
        fig1.width = 6;
        // Way  dot operator will be used for acceessing values of data members for object
        System.out.println("Length : " + fig1.length);   
        System.out.println("Width : " + fig1.width);   
    }
}