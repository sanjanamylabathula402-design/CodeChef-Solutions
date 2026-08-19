class Codechef {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},  
            {4, 5, 6},  
            {7, 8, 9}   
        };

        int sum = 0;

        // Column-major traversal
        for (int j = 0; j < 3; j++) {  // Iterate over columns first
            for (int i = 0; i < 3; i++) {  // Iterate over rows next
                sum += matrix[i][j];  // Access elements in column-major order
            }
        }

        System.out.println("Total Sum: " + sum);
    }
}
