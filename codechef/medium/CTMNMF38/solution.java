class Codechef {
    public static void main(String[] args) {
        int num = 10; // Start checking from 10

        while (num <= 20) { // Loop runs until 20
            if (num % 3 == 0) { // Check if num is a multiple of 3
                System.out.println("First multiple of 3 found: " + num);
                break; // Exit the loop once found
            }
            num++; // Increment num to check the next number
        }
    }
}
