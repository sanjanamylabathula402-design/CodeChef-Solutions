import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Predefined emergency access codes
        int emergencyKeycode = 4321;
        int overrideCode = 9999;

        Scanner sc= new Scanner(System.in);
        int enteredCode=sc.nextInt();
        
        // Checking if the entered code matches either emergencyKeycode or overrideCode
        if (enteredCode == emergencyKeycode || enteredCode == overrideCode) {
            System.out.println("Access Granted: Emergency Entry Allowed.");
        } else {
            System.out.println("Access Denied: Invalid Code.");
        }

    }
}
