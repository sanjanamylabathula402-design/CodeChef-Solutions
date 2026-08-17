class Codechef {
    public static void main(String[] args) {
        int j = 5; // Loop variable declared outside

        // Loop increments j from 5 to 9
        for ( ; j <= 9; j++) {  // it is optional to write initial statement, condition and increment statement
            System.out.println("Inside loop: " + j);  
        }

        // j retains its value and is accessible here
        System.out.println("Outside loop: " + j); 
    }
}
