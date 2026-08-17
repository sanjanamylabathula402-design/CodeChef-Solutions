import java.util.*;
// Program to check if a student has passed the exam
class Codechef {
    public static void main(String[] args) {
        int score = 75; // Student's score
        int passingScore = 50; // Minimum score required to pass

        // Check if the student's score is greater than or equal to the passing score
        if (score >= passingScore) {
            System.out.println("Congratulations! You passed the exam.");
        } else {
            System.out.println("You did not pass. Better luck next time!");
        }

        System.out.println("Result check completed.");
    }
}
