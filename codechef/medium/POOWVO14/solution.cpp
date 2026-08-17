class Codechef {
    public static void main(String[] args) {
        boolean foundMultiple = false; // Flag to control loop
        int start = 10; // Starting number

        // Flag-controlled loop: Runs until the flag is set to true
        while (!foundMultiple) {
            System.out.println("Checking: " + start);

            // Check if the number is a multiple of 7
            if (start % 7 == 0) {
                foundMultiple = true; // Set flag to true to exit loop
                System.out.println("First multiple of 7 found: " + start);
            } else {
                start++; // Only increment if a multiple is not found
            }
        }
    }
}
