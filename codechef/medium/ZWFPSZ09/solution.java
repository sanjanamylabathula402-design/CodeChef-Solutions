import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Collect the temperature as a float
        float temperature = scanner.nextFloat(); // Input temperature (float)

        // Collect the humidity percentage as a double
        double humidity = scanner.nextDouble(); // Input humidity (double)

        // Collect the rain prediction as a boolean
        boolean willRain = scanner.nextBoolean(); // Input rain prediction (boolean)

        // Display the collected weather details
        System.out.println("Weather Information:");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Rain Expected: " + willRain);

        // Close the Scanner object
        scanner.close();
    }
}
