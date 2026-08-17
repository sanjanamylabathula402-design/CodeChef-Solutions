import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt(); // User's age
        boolean hasMembershipCard = sc.nextBoolean(); // Whether the user has a membership card
        boolean isAccompaniedByMember = sc.nextBoolean(); // Whether the user is accompanied by a member
        boolean isBanned = sc.nextBoolean(); // Whether the user has been banned previously

        // Check if the user has been banned
        if (isBanned) {
            System.out.println("Not eligible for gym entry due to ban.");
        } 
        // Check if the user is at least 18 years old and has a membership card
        else if (age >= 18 && hasMembershipCard) {
            System.out.println("Eligible for gym entry with a membership card.");
        } 
        // Check if the user is at least 18 years old and accompanied by a member
        else if (age >= 18 && isAccompaniedByMember) {
            System.out.println("Eligible for gym entry when accompanied by a member.");
        } 
        // If the user does not meet any eligibility criteria
        else {
            System.out.println("Not eligible for gym entry.");
        }
    }
}
