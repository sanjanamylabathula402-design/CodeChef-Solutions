import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for luggage weight
        int luggageWeight = scanner.nextInt();

        // Defining the maximum allowed weight
        int maxWeight = 20;

        // Checking if the luggage meets the weight restriction
        if (luggageWeight <= maxWeight) {
            System.out.println("Your luggage is within the allowed limit.");
        } else {
            int excessWeight = luggageWeight - maxWeight;
            System.out.println("Your luggage exceeds the limit by " + excessWeight + " kg. Additional charges may apply.");
        }

        System.out.println("Luggage check completed.");
    }
}
