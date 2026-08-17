import java.util.Scanner; // Import the Scanner class for user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt(); 
        int sum = 0; // Initialize the variable to store the sum of even numbers

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if the current number is even
            if (i % 2 == 0) { // Numbers divisible by 2 are even
                sum += i; // Add the even number to the sum
            }
        }

        // Print the final sum of all even numbers in the range
        System.out.println("The sum of even numbers is: " + sum);
    }
}
