class Codechef {
    public static void main(String[] args) {
        int bakingTime = 4; // Initialize baking time in minutes

        // Use a while loop to count down from 4 to 0
        while (bakingTime > 0) {  // The loop runs as long as bakingTime is greater than 0
        
            System.out.println("Time left: " + bakingTime + " minutes"); // Display remaining time
            
            bakingTime--;  // Decrease the time by 1 minute in each iteration
        }

        // Once the loop ends, display a message indicating baking is complete
        System.out.println("Baking complete! Enjoy your cookies!");  
    }
}
