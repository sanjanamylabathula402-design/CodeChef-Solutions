import java.util.Scanner; // Import Scanner class for taking input from the user

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input

        // Read the marks input from the user
        int marks = scanner.nextInt(); 

        // Use a ternary operator to calculate the grade based on marks
        // Check marks and assign grade as "A+", "A", "B", "C", or "Fail"
        String grade = (marks >= 90) ? "A+" : 
                       (marks >= 80) ? "A" : 
                       (marks >= 70) ? "B" : 
                       (marks >= 60) ? "C" : "Fail";

        // Output the calculated grade
        System.out.println("The grade is: " + grade);

        scanner.close(); // Close the Scanner object to free up resources
    }
}
