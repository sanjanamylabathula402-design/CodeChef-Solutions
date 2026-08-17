import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking age input from the user
        int age = scanner.nextInt();
        
        int minSeniorAge = 60; // Minimum age required for discount
        
        // Checking eligibility for the discount
        if (age >= minSeniorAge) {
            System.out.println("You are eligible for a senior citizen discount!");
            System.out.println("Enjoy your discounted movie ticket.");
        } else {
            // Calculating how many more years are needed
            int yearsLeft = minSeniorAge - age;
            System.out.println("You are not eligible for a senior citizen discount.");
            System.out.println("You need to wait " + yearsLeft + " more years to qualify.");
        }
    }
}
