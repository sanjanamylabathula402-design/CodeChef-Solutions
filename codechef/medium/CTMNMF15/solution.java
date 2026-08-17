import java.util.*;

class Codechef {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        
        // Ask the user to enter the initial water level
        // Read the user input as a double value
        double waterLevel = scanner.nextDouble(); 
        
        // Start while loop to decrease water level
        while (waterLevel > 10) {  
            
            System.out.println("Current water level: " + waterLevel + " liters."); // Display remaining water
            
            // Reduce water level by 10 liters in each iteration
            waterLevel--; 
        }

        // Alert user when only 10 liters remain
        System.out.println("Warning! Water level is low (10 liters). Please refill the tank!");
        
        scanner.close(); // Close the Scanner
    }
}