import java.util.Scanner; // Import Scanner class for user input

class Codechef { 
    public static void main(String[] args) { 
        // Initialize a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in); 
        
        // Store the user's input in a variable called "text"
        String text = scanner.nextLine(); 

        // Inform the user that the program will display characters in reverse order
        System.out.println("Characters in reverse order: "); 
        
        // Loop through the string in reverse order
        for (int i = text.length() - 1; i >= 0; i--) {
            // Print each character of the string starting from the last character
            System.out.print(text.charAt(i)); 
        }
        
        // Print a new line after displaying all characters in reverse
        System.out.println(); 
    }
}
