import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for age
        int age = scanner.nextInt();

        // Checking exam eligibility
        if (age >= 17) {
            System.out.println("You are eligible to take the entrance exam.");
        } else {
            System.out.println("You are not eligible to take the entrance exam.");
        }
    }
}
