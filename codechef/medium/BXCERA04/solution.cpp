            employee = (Employee) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred while loading the employee object from the file.");
        }
        return employee;
    }
}

class Codechef {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 60000.0);

        // Save the employee object to a file
        SaveEmployee.saveEmployee(employee, "employee.ser");

        // Load the employee object from the file
        Employee loadedEmployee = LoadEmployee.loadEmployee("employee.ser");