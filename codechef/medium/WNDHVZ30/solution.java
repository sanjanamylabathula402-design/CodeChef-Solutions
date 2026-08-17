import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for morning and evening water intake
        int morningWater = scanner.nextInt();
        
        int eveningWater = scanner.nextInt();
        
        // Calculating total water intake
        int totalWater = morningWater + eveningWater;

        // Checking if total intake is less than 2000 ml
        if (totalWater < 2000) {
            System.out.println("You need to drink more water to stay hydrated!");
        } else {
            System.out.println("Great job! You have met your daily water intake goal!");
        }
    }
}
