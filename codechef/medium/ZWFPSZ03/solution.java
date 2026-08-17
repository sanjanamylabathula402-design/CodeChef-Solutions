// Importing the Scanner class for user input
import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the user's input directly and use it in an output statement
        // No variable is used to store the input; it is passed directly
        System.out.println("Oh, " + scanner.nextInt() + " is a great choice!");
        
        // Close the Scanner to release system resources
        scanner.close();
    }
}
