                double salary = Double.parseDouble(data[2]);
                employees.add(new Employee(name, role, salary));
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error reading from CSV file.");
        }
        return employees;
    }
}

class Codechef {
    public static void main(String[] args) {

        // Read the employees from the CSV file
        ArrayList<Employee> readEmployees = EmployeeDataHandler.readEmployeesFromCsv("employees.csv");

        // Print the employees