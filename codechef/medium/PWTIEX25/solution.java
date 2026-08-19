import java.util.Scanner;

class Codechef {

    // Method without parameters and return type
    public static void displayLibraryInfo() {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        String libraryName = scanner.nextLine();
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();  // consume the newline character left by nextInt()
        String libraryAddress = scanner.nextLine();

        // Displaying the library information
        System.out.println("Library Information:");
        System.out.println("Library Name: " + libraryName);
        System.out.println("Number of Books: " + numberOfBooks);
        System.out.println("Library Address: " + libraryAddress);
    }

    public static void main(String[] args) {
        // Calling the method to display library information
        displayLibraryInfo();
    }
}
