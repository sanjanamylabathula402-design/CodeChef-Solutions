import java.util.Scanner; // Import the Scanner class for user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in); 
        
        // Prompt the user to enter the number of rows
        int rows = scanner.nextInt();

        // Outer loop to iterate through each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to iterate through each column in the current row
            for (int j = 1; j <= rows; j++) {
                // Print the current column number with a space
                System.out.print(j + " ");
            }
            // Move to the next line after printing all columns for the current row
            System.out.println();
        }

        scanner.close(); // Close the Scanner object to release resources
    }
}
