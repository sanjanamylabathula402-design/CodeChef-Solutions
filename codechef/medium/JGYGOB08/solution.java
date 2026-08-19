// Parent class
class Person {

    // Constructor of the parent class
    Person() {
        System.out.println("Person object created.");
    }

    // Method of the parent class
    void introduce() {
        System.out.println("I am a person.");
    }
}

// Subclass that inherits from Person
class Student extends Person {

    // Constructor of the subclass
    Student() {
        super(); // Calls the constructor of the parent class
    }

    // Method that includes both parent and child behavior
    void introduceStudent() {
        super.introduce(); // Calls the introduce() method from the parent class
        System.out.println("I am also a student.");
    }
}

// Main class to run the program
class Codechef {
    public static void main(String[] args) {
        Student s = new Student();     // Creates a Student object
        s.introduceStudent();          // Calls method to show full introduction
    }
}