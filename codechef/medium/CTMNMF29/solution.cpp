import java.util.Scanner;
class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the initial elevation
        int currentElevation = scanner.nextInt();

        // Loop to decrement elevation by 50 meters until reaching 100 meters or less
        while (currentElevation > 100) {
            System.out.println("Current elevation: " + currentElevation + " meters.");
            currentElevation -= 50; // Decrement the elevation by 50 meters
        }

        // Display the end of the trail message
        System.out.println("End of the trail reached at 100 meters or below.");
    }
}
