class Codechef {
    public static void main(String[] args) {
        int range = 100; // Upper limit of the range

        // Loop through numbers from 1 to range
        for (int i = 1; i <= range; i+=4) {
            
            // Check if the number is greater than 50
            if (i > 50) { 
                System.out.println("First number greater than 50 found: " + i); // Print the number
                break; // Exit the loop immediately
            }
        }
    }
}
