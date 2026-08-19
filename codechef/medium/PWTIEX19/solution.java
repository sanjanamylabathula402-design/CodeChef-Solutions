// Class demonstrating default field initialization
class Codechef {
    // Step 1: Declare instance variables without initialization
    int intValue;         // Default: 0
    double doubleValue;   // Default: 0.0
    boolean boolValue;    // Default: false
    String stringValue;   // Default: null

    public static void main(String[] args) {
        // Step 2: Create an object of the class
        Codechef obj = new Codechef();

        // Step 3: Print default values of instance variables
        System.out.println("Default int value: " + obj.intValue);
        System.out.println("Default double value: " + obj.doubleValue);
        System.out.println("Default boolean value: " + obj.boolValue);
        System.out.println("Default String value: " + obj.stringValue);
    }
}
