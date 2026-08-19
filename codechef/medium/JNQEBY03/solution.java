class Codechef {
    // Instance variables for name and age
    String name;
    int age;

    // Default constructor to initialize name and age with predefined values
    Codechef() {
        name = "John Doe";  // Default name for the participant
        age = 20;           // Default age for the participant
    }

    public static void main(String[] args) {
        // Creating an object of Codechef class
        // The default constructor is automatically called here
        Codechef participant = new Codechef();

        // Printing the participant's details
        System.out.println("Name: " + participant.name);
        System.out.println("Age: " + participant.age);
    }
}



