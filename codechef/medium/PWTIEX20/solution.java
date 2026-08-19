import java.util.Scanner; // Import Scanner for user input

// Book class with default field initialization
class Book {
    String title = "Unknown Title"; // Default value for title
    String author = "Unknown Author"; // Default value for author
}

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        
        // Prompt user to enter the number of books
        int numBooks = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        // For loop to input details for multiple books
        for (int i = 1; i <= numBooks; i++) {
            Book myBook = new Book(); // Create a new Book object

            // Prompt user to enter book details
            myBook.title = sc.nextLine(); // Assign user input to title
            
            myBook.author = sc.nextLine(); // Assign user input to author
            // Display book details
            System.out.println("\nBook " + i + " Details:");
            System.out.println("Title: " + myBook.title);
            System.out.println("Author: " + myBook.author);
            System.out.println(); // Adding a blank line for readability
        }

        sc.close(); // Close scanner
    }
}
