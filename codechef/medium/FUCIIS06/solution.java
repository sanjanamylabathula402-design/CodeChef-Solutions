import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read the user's input as a string
        String input = scanner.nextLine();
        
        // Create a StringBuilder object to construct the output string
        StringBuilder result = new StringBuilder();
        
        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // Convert the current character to lowercase for comparison
            char c = Character.toLowerCase(input.charAt(i));
            
            // Check if the character is a vowel (a, e, i, o, u)
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                // If it is a vowel, append an asterisk (*) to the result
                result.append('*');
            } else {
                // If it is not a vowel, append the original character to the result
                result.append(input.charAt(i));
            }
        }
        
        // Print the final result string with vowels replaced by asterisks
        System.out.println("Result: " + result.toString());
        
        // Close the scanner to release resources
        scanner.close();
    }
}
