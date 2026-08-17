import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for delivery conditions
        boolean isWithinCity = scanner.nextBoolean();
        int orderTime = scanner.nextInt();

        // Checking eligibility for same-day delivery
        if (isWithinCity || orderTime < 14) {
            System.out.println("Package qualifies for same-day delivery.");
        } else {
            System.out.println("Package does not qualify for same-day delivery.");
        }
    }
}
