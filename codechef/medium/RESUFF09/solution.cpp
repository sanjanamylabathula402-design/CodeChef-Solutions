class Codechef {
    public static void main(String[] args) {
        double temperature = 25.5; // Predefined temperature value
        
        // Check if the temperature is greater than 30
        if (temperature > 30) {
            System.out.println("Stay hydrated and seek shade"); // Print a message for hot weather
        } 
        // Check if the temperature is between 20 and 30 (inclusive of 20)
        else if (temperature >= 20) {
            System.out.println("Enjoy the pleasant weather"); // Print a message for comfortable weather
        } 
        // Check if the temperature is between 10 and 20 (inclusive of 10)
        else if (temperature >= 10) {
            System.out.println("Bring a light jacket"); // Print a message for slightly cold weather
        } 
        // If the temperature is less than 10
        else {
            System.out.println("Wear warm clothes"); // Print a message for cold weather
        }
    }
}
