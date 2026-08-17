class Codechef {
    public static void main(String[] args) {
        // Initialize the variable 'marks' with a predefined value (87)
        int marks = 87; 

        // Outer 'if' statement checks if the marks are 60 or above
        if (marks >= 60) { 
            // Nested 'if' checks if the marks are 85 or above
            if (marks >= 85) { 
                System.out.println("Excellent performance!"); // Output message for marks 85 and above
            } else { 
                // If marks are between 60 and 84
                System.out.println("Good performance. Keep it up!"); // Output message for marks 60 to 84
            }
        } else { 
            // If marks are less than 60
            System.out.println("Needs improvement. Study harder!"); // Output message for marks below 60
        }
    }
}
