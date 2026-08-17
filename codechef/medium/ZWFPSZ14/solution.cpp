import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // 'next()' method reads a single word as input
        String firstName = scanner.next();

        // Consume the newline character left in the input buffer after the previous input
        scanner.nextLine();
        
        // 'nextLine()' method reads an entire line of input until the Enter key is pressed
        String fullName = scanner.nextLine();

        // 'next().charAt(0)' retrieves the first character of the input
        char favoriteLetter = scanner.next().charAt(0);

        // Display the collected personal information
        System.out.println("Personal Information:");
        System.out.println("First Name: " + firstName); // Prints the first name
        System.out.println("Full Name: " + fullName);   // Prints the full name
        System.out.println("Favorite Letter: " + favoriteLetter); // Prints the favorite letter

        // Close the Scanner to release resources
        scanner.close();
    }
}
