class Codechef {
    public static void main(String[] args) {
        int row = 1; // Initialize row counter

        // Outer loop: Iterates through 4 rows
        while (row <= 4) {  
            int column = 1; // Reset column for each row

            // Inner loop: Iterates through 4 columns
            while (column <= 4) {  
                System.out.print("(" + row + "," + column + ") "); // Print cell coordinates
                column++; // Increment column
            }

            System.out.println(); // Move to the next line after completing a row
            row++; // Increment row counter
        }
    }
}
