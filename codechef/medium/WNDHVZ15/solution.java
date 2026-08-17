import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Declaring a variable to store the secret code
        int secretCode = 7890;
        
        Scanner sc = new Scanner(System.in);
        int enteredCode=sc.nextInt();
        
        // Checking if the enteredCode code matches the predefined secretCode
        if ( enteredCode==secretCode ) {  // Fill in the blank
            System.out.println("Access Granted: Vault Unlocked."); // Fill in the blank
        } else {
            System.out.println("Access Denied"); // Fill in the blank
        }

        // Indicating that the verification process is complete
        System.out.println("Verification completed.");
    }
}
