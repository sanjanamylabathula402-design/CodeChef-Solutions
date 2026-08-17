import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in); 
        int rows = scanner.nextInt(); 

        // Outer loop to iterate over each row in the pattern
        for (int i = rows; i >= 1; i--) {
            // Inner loop to print numbers in increasing order for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // Print the current number followed by a space
            }
            // Move to the next line after completing the current row
            System.out.println();
        }

        scanner.close(); // Close the Scanner object to release resources
    }
}
