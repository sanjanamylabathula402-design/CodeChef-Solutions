import java.util.Scanner;

class EmployeeSalary {
    // Method to calculate the gross salary with return type
    public static double calculateSalary(double basicSalary) {
        double HRA = 0.10 * basicSalary;  // 10% of basic salary
        double DA = 0.05 * basicSalary;   // 5% of basic salary
        return basicSalary + HRA + DA;    // Return gross salary
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user for basic salary
        double basicSalary = scanner.nextDouble();
        
        // Call method to calculate gross salary
        double grossSalary = calculateSalary(basicSalary);
        
        // Calculate HRA and DA
        double HRA = 0.10 * basicSalary;
        double DA = 0.05 * basicSalary;
        
        // Displaying the details
        System.out.println("Employee Salary Details:");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + grossSalary);
        
        scanner.close();
    }
}
