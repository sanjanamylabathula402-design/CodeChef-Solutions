class Codechef {
    public static void main(String[] args) {
        double fuel = 7.0; // Initial fuel level is 7 liters

        // While the fuel level is greater than 1.0, keep reducing it
        while (fuel > 1.0) {  
            System.out.println("Fuel remaining: " + fuel + " liters."); // Display remaining fuel
            fuel -= 1.0; // Reduce fuel by 1.0 liter in each iteration
        }

        // Alert the driver when only 1.0 liter of fuel remains
        System.out.println("Warning! Only 1.0 liter of fuel left. Refuel soon!");  
    }
}
