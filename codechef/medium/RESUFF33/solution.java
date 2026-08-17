class Codechef {
    public static void main(String[] args) {
        // Initialize the variable 'role' to store the user's role
        String role = "Admin"; // Example role: "Admin", "Manager", or "User"

        // Use a switch statement to determine the access level based on the user's role
        switch (role) {
            case "Admin": // If the role is "Admin"
                System.out.println("Admin: Full access to the system."); 
                break; // Exit the switch statement after executing this case

            case "Manager": // If the role is "Manager"
                System.out.println("Manager: Moderate access to the system."); 
                break; // Exit the switch statement after executing this case

            case "User": // If the role is "User"
                System.out.println("User: Limited access to the system."); 
                break; // Exit the switch statement after executing this case

            default: // If the role does not match any predefined cases
                System.out.println("Invalid role."); 
                break; // Exit the switch statement (optional for the last case)
        }
    }
}
