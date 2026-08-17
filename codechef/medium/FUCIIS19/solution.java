import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the value of 'n'
        int n = scanner.nextInt();

        int sum = 0; // Initialize the sum to 0

        // Use a for loop to calculate the summation of squares
        for (int i = 1; i <= n; i++) {
            sum += i * i; // Add the square of each number to the sum
        }

        // Print the result
        System.out.println("The sum of the squares of the first " + n + " natural numbers is: " + sum);
        
        scanner.close();
    }
}
