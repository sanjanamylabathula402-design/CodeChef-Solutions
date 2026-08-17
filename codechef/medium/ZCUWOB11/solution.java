import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        
        int start = scanner.nextInt(); // Read start value
        int end = scanner.nextInt(); // Read end value
        
        int sum = 0; // Variable to store sum of odd numbers
        
        // Loop from start to end
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                sum += i; // Add odd number to sum
            }
        }
        
        // Print the total sum of odd numbers
        System.out.println("Sum of odd numbers: " + sum);
        
        scanner.close(); // Close the scanner
    }
}