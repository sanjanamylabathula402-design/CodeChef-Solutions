class Book {
    String title;
    String author;

    // Method to display book information
    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    public static void main(String[] args) {
        
        // Create a Book object and assign title and author
        Book book1 = new Book();  // Create a new Book object
        book1.title = "King Lear";  // Assign the title
        book1.author = "William Shakespeare";  // Assign the author
        
        // Call the displayInfo function to print book details
        book1.displayInfo();  // Output: Title: King Lear, Author: William Shakespeare
    }
}
