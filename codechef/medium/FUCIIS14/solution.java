import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter the number for the multiplication table
        int number = scanner.nextInt(); // Fill in the blank

        // Prompt the user to enter the range for the table
        int range = scanner.nextInt(); // Fill in the blank

        // Printing the multiplication table header
        System.out.println("Multiplication Table for " + number + " up to " + range + ":");

        // Using a for loop to generate the table
        for (int i = 1; i <= range; i++) {  // Fill in the blanks
            System.out.println(number + " x " + i + " = " + (number * i)); // Fill in the blank
        }

        scanner.close(); // Close the Scanner object
    }
}
