import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the student's score
        int score = scanner.nextInt();

        // Checking eligibility for the advanced course
        if (score > 60) {
            System.out.println("You are eligible for the advanced course!");
        } else {
            System.out.println("You need to score higher to enroll in the advanced course.");
        }
    }
}
