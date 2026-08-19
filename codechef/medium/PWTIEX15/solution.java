import java.util.Scanner;

class Student {
    // Instance variables
    String name;
    int rollNumber;
    double grade;
}

class Codechef {
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student();

        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Read input for the student's details
        student.name = scanner.nextLine();  // Read student's name
        student.rollNumber = scanner.nextInt();  // Read student's roll number
        student.grade = scanner.nextDouble();  // Read student's grade

        // Display the student's details using instance variables
        System.out.println("Student Details:");
        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Grade: " + student.grade);

        // Close scanner
        scanner.close();
    }
}
