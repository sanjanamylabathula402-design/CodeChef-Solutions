import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Collect the traveler's name
        String name = scanner.nextLine(); // Traveler's name (String)

        // Collect the number of travelers
        int numTravelers = scanner.nextInt(); // Number of travelers (int)

        // Collect the ticket price per traveler
        double ticketPrice = scanner.nextDouble(); // Ticket price (double)

        // Collect the total luggage weight in kilograms
        float luggageWeight = scanner.nextFloat(); // Luggage weight (float)

        // Collect meal preference as a boolean (true/false)
        boolean includeMeals = scanner.nextBoolean(); // Meal preference (boolean)

        // Display the travel booking details
        System.out.println("Booking Information:");
        System.out.println("Name: " + name); // Display traveler's name
        System.out.println("Number of Travelers: " + numTravelers); // Display the number of travelers
        System.out.println("Ticket Price per Traveler: $" + ticketPrice); // Display ticket price per traveler
        System.out.println("Luggage Weight: " + luggageWeight + " kg"); // Display luggage weight
        System.out.println("Meals Included: " + includeMeals); // Display meal inclusion status

        // Close the Scanner object to release system resources
        scanner.close();
    }
}
