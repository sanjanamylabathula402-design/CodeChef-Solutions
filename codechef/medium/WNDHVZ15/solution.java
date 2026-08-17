import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for total books and number of students
        int totalBooks = scanner.nextInt();

        int students = scanner.nextInt();

        // Calculating books per student and remaining books
        int booksPerStudent = totalBooks / students;
        int remainingBooks = totalBooks % students;

        // Printing the output based on the condition
        if (remainingBooks == 0) {
            System.out.println("Each student gets " + booksPerStudent + " books equally.");
        } else {
            System.out.println("Each student gets " + booksPerStudent + " books, but " + remainingBooks + " books remain undistributed.");
        }
    }
}
