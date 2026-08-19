
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nContact Manager Menu:");
            System.out.println("1. Add a Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search for a Contact");
            System.out.println("4. Update a Contact");
            System.out.println("5. Delete a Contact");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");
            String choice = scanner.nextLine().trim();

            if (choice.equals("6")) {
                System.out.println("Goodbye!");
                break;
            }
