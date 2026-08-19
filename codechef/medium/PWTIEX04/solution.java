// Create your Student class here
class Student {
    // Step 1: Declare fields
    String name;
    int age;
    char grade;

    // Step 2: Create method to display student information
    void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

//---------------------

class Main {
    public static void main(String[] args) {
        // Create a Student object and assign values
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 15;
        student1.grade = 'A';
        
        // Call the displayInfo method to print student details
        student1.displayInfo();
    }
}
