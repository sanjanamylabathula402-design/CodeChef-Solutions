class Codechef {
    public static void main(String[] args) {
        int n = 30;       // Define upper limit
        int sum = 0;      // Initialize accumulator
        int number = 2;   // Start from 2 (first even number)

        // Loop through numbers from 2 to n
        while (number <= n) {
            sum += number; // Add even number to sum
            number += 2;   // Increment by 2 to only get even numbers
        }

        System.out.println("Sum of even numbers from 2 to " + n + " is: " + sum);
    }
}
