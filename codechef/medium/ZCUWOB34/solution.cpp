class Codechef {
    public static void main(String[] args) {
        int start = 1; // Starting number
        int end = 20;  // Ending number

        // Loop from start to end with a step value of 4
        for (int i = start; i <= end; i += 4) { // Increment by 4 in each iteration
            
            // Check if the number is a multiple of 3
            if (i % 3 == 0) { 
                continue; // Skip multiples of 3 and move to the next iteration
            }

            System.out.println(i); // Print numbers that are not multiples of 3
        }
    }
}
