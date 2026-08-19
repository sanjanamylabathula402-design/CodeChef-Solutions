import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {

        // Here we are storing String type (will be enclosed in " ") of values in ArrayList
        ArrayList<String> employeeNames = new ArrayList<>();

        
        employeeNames.add("Alex"); 
        employeeNames.add("Bobby");

        // Printing the ArrayList elements, will be discussed in next knowledge point
        System.out.println("Employee 1: " + employeeNames.get(0));
        System.out.println("Employee 2: " + employeeNames.get(1));

    }
}
