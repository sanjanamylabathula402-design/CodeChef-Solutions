import java.util.Scanner; // Import the Scanner class to read input from the user

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for taking user input

        // Prompt the user to enter the hour of the day (0 to 23)
        int hour = scanner.nextInt(); // Read the input value as an integer
        
        // Check if the hour is between 5 and 11 inclusive (morning time)
        if (hour >= 5 && hour <= 11) {
            System.out.println("Good morning!"); // Print morning greeting
        } 
        // Check if the hour is between 12 and 17 inclusive (afternoon time)



        // Check if the hour is between 18 and 21 inclusive (evening time)



        // Check if the hour is between 22 and 23 inclusive (night time)



        // If the entered hour is invalid (not between 0 and 23)




        scanner.close(); // Close the Scanner object to prevent resource leaks
    }
}
