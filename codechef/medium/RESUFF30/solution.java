import java.util.Scanner; // Import Scanner class to take input from the user

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in); 

         // Read user input and store it in the 'warningLevel' variable
        int warningLevel = scanner.nextInt();

        switch (warningLevel) {
            case 1: // Case for Advisory
                System.out.println("Advisory: Be cautious, weather may affect your plans.");
                // No 'break', so execution continues to the next case

            case 2: // Case for Watch
                System.out.println("Watch: Conditions may escalate, stay alert.");

            case 3: // Case for Warning
                System.out.println("Warning: Severe weather expected, take precautions.");

                System.out.println("Stay safe."); // Generic safety message
        }

        scanner.close(); // Close the Scanner object to release resources
    }
}
