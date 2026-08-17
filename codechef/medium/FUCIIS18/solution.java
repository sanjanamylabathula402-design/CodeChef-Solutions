import java.util.Scanner; // Import the Scanner class for user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in); 
        
        // Prompt the user to enter the value of 'n'
        int n = scanner.nextInt(); 
        
        int sum = 0; // Initialize the sum to 0

        // Use a for loop to calculate the summation
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each number to the sum
        }

        // Print the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        
        scanner.close(); // Close the Scanner object to release resources
    }
}
