import java.util.*;

class Codechef {
    public static void main(String[] args) {
        String storedPassword = "Secure123";
        int requiredClearance = 3;

        Scanner scanner = new Scanner(System.in);

        // Taking user input
        String enteredPassword = scanner.next();
        int clearanceLevel = scanner.nextInt();

        // Checking access conditions
        if (enteredPassword.equals(storedPassword) && clearanceLevel >= requiredClearance) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }

        System.out.println("Security check completed.");
    }
}
