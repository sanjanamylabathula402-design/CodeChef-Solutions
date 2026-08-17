import java.util.Scanner; // Import Scanner for user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the input as a boolean and store it
        boolean isSubscribed = scanner.nextBoolean(); // Input: true or false

        // Display subscription status
        System.out.println("\nSubscription Status:");
        System.out.println("Subscribed: " + isSubscribed);

        // Close the Scanner object
        scanner.close();
    }
}
