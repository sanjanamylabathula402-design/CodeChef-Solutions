import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Taking input of studentScore and passingScore
        
        Scanner sc = new Scanner(System.in);
        int studentScore=sc.nextInt();
        int passingScore=sc.nextInt();
        
        // Checking if the student meets the scholarship criteria
        if (studentScore >= passingScore) {  // Fill in the blank
            System.out.println("Scholarship Granted!"); // Fill in the blank
        } else {
            System.out.println("Scholarship Denied!"); // Fill in the blank
        }

        // Indicating that the evaluation process is complete
        System.out.println("Evaluation completed.");
    }
}
