import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // user to enter the number of apples
        int apples = scanner.nextInt();

        // Check if apples can be evenly divided by 4
        if (apples % 4 == 0) {
            System.out.println("The apples can be evenly shared among friends!");
        } else {
            System.out.println("Some apples will be left over after sharing!");
        }
    }
}
