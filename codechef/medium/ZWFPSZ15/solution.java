import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their username (a single word)
        String username = scanner.next();

        // Consume the leftover newline character from the input buffer after the previous input
        scanner.nextLine(); 

        // Prompt the user to enter a biography (a full line, possibly containing spaces)
        String bio = scanner.nextLine(); 

        // Prompt the user to enter the initial of their favorite color
        char colorInitial = scanner.next().charAt(0); 

        // Display the user's profile information
        System.out.println("User Profile:");
        System.out.println("Username: " + username);
        System.out.println("Bio: " + bio); 
        System.out.println("Favorite Color Initial: " + colorInitial); 

        // Close the Scanner object to release system resources
        scanner.close();
    }
}
