class Codechef {
    public static void main(String[] args) {
        // Define the maximum number limit for the calculation
        int maxNumber = 20; 

        // Initialize sum to store the total sum of numbers
        int sum = 0; 

        // Start from 1 as the first number in the sequence
        int currentNumber = 1;  

        // While loop to iterate as long as currentNumber is less than or equal to maxNumber
        while (currentNumber <= maxNumber) {
            // Add the current number to the sum
            sum += currentNumber;  

            // Move to the next third number by incrementing by 3
            currentNumber += 3;    
        }

        // Print the final sum of every third number up to the given maxNumber
        System.out.println("The sum of every third number up to " + maxNumber + " is: " + sum);
    }
}
