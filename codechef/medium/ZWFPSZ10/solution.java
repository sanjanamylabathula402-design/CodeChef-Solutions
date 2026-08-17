import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // The value is expected to be of type double
double Celsius = scanner.nextDouble();
double Fahrenheit=(Celsius * 9/5) + 32;

      
        // Displaying the converted Fahrenheit temperature

  System.out.println("Temperature in Fahrenheit: " + Fahrenheit);

        // Closing the Scanner object to release system resources and prevent memory leaks
scanner.close();
    }
}