class Codechef {
    
    // Static variable: Shared by all instances of the class
    static int staticVar = 10;

    // Static method: Can be called without creating an instance of the class
    static void staticMethod() {
        System.out.println("Static Method called");
    }

    // Static block: Executes once when the class is loaded
    static {
        System.out.println("Static Block executed");
    }

    public static void main(String[] args) {
        // Accessing static variable directly without creating an object
        System.out.println("Static Variable: " + staticVar);

        // Calling static method without creating an object of the class
        staticMethod();
    }
}
