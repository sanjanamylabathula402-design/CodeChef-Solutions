import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int correctPIN = 1234;
        boolean isVerified = false; 
        while (!isVerified) {
            int userPIN = scanner.nextInt();
            if (userPIN == correctPIN) {
                isVerified = true; 
                System.out.println("Access granted!"); 
            } else {
                System.out.println("Invalid PIN. Try again."); 
            }
        }

        scanner.close();
    }
}