import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of terms
        int terms = scanner.nextInt();

        int first = 0, second = 1; // First two Fibonacci numbers
        int count = 2; // Counter to track the number of terms generated

        // Print first two numbers
        System.out.print("Fibonacci Series: " + first + " " + second + " ");

        // Use while loop to generate the remaining Fibonacci numbers
        while (count < terms) {
            int next = first + second; // Calculate the next term
            System.out.print(next + " "); // Print the term
            first = second; // Update values
            second = next;
            count++; // Increment counter
        }

        scanner.close(); // Close the scanner
    }
}
