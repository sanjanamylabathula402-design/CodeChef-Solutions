import java.util.Scanner;

class Codechef {
    double principal, rate, time;

    // Constructor using 'this' keyword
    public Codechef(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    // Method to calculate and return Simple Interest
    public double calculateInterest() {
        return (this.principal * this.rate * this.time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[3];  // Array to store principal, rate, and time

        // Loop to take inputs dynamically
        for (int i = 0; i < 3; i++) {
            values[i] = scanner.nextDouble();
        }

        // Creating Codechef object
        Codechef sic = new Codechef(values[0], values[1], values[2]);

        // Printing calculated Simple Interest
        System.out.println("Simple Interest: " + sic.calculateInterest());

        scanner.close();
    }
}
