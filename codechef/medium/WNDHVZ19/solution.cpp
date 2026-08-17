import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Variable representing payment status
        String paymentStatus = "Pending";

        // Check if the payment is completed
        if (paymentStatus != "Completed") {
            System.out.println("Your payment is still pending. Please complete it.");
        } else {
            System.out.println("Your payment has been successfully completed.");
        }

        System.out.println("Payment status check completed.");
    }
}
