class Codechef {
    public static void main(String[] args) {
        int size = 4; // Define table size (4x4)

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                System.out.print((i * j) + "\t"); // Print product with tab space
            }
            
            System.out.println(); // Move to the next line after printing a row
        }
    }
}
