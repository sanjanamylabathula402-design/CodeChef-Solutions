class Codechef {
    public static void main(String[] args) {
        int range = 20; // Define the range limit

        // Loop through numbers from 10 to 20
        for (int i = 10; i <= range; i++) {
            
            // Check if the number is a multiple of 7
            if (i % 7 == 0) {
                System.out.println("First multiple of 7 found: " + i); // Print the first multiple
                break; // Exit the loop immediately
            }
        }
    }
}