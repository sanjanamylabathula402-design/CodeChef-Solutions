import java.util.Scanner;  // Import Scanner for user input  

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object  
        
        // Prompt the user to enter the number for which the table is generated  
        // Read the user's input directly and use it in the while loop
        int number = scanner.nextInt();  // Read user input using the scanner object

        int multiplier = 1;  // Initialize counter  

        // Loop will run until multiplier becomes equal to 10
        while (multiplier <= 10) {  
            System.out.println(number + " x " + multiplier + " = " + (number * multiplier));  
            multiplier++;  // Increment counter  
        }
        
        scanner.close();  // Close the scanner  
    }
}