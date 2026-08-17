import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Variables representing waiver conditions
        boolean isSeniorCitizen = false;
        boolean hasMembership = true;

        // Check if the user qualifies for a late fee waiver
        if (isSeniorCitizen || hasMembership) {
            System.out.println("Your late fee is waived.");
        } else {
            System.out.println("You need to pay the late fee.");
        }

        System.out.println("Library fee check completed.");
    }
}
