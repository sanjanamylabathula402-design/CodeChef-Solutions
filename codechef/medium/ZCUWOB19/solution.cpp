class Codechef {
    public static void main(String[] args) {
        int start = 11; // Starting number
        int end = 0; // Ending number
        int step = 2; // Step decrement

        // Loop to print numbers in descending order with step -2
        for (int i = start; i >= end; i -= step) {
            System.out.println(i); // Print the current value
        }
    }
}
