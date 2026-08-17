import java.util.Scanner; // Import the Scanner class to read user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the Math score from the user
        int mathScore = scanner.nextInt();

        // Read the Science score from the user
        int scienceScore = scanner.nextInt();

        // Read the English score from the user
        int englishScore = scanner.nextInt();

        // Calculate the total score by adding the individual scores
        int totalScore = mathScore + scienceScore + englishScore;

        // Calculate the average score by dividing the total by the number of subjects
        double averageScore = totalScore / 3.0;

        // Print the total score
        System.out.println("Total Score: " + totalScore);

        // Print the average score
        System.out.println("Average Score: " + averageScore);

        // Close the Scanner to release system resources
        scanner.close();
    }
}
