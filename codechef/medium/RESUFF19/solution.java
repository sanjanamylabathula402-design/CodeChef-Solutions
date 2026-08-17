class Codechef {
    public static void main(String[] args) {
        // Initialize the variable 'password' with a predefined value
        String password = "mypass123"; 

        // Use a ternary operator to evaluate the password strength
        // If the length of the password is less than 8 characters, it is "Weak"
        // Otherwise, the password is "Strong"
        String strength = password.length() < 8 ? "Weak" : "Strong";
        
        // Output the password strength to the console
        System.out.println("Password strength: " + strength);
    }
}
