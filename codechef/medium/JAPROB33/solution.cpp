            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");
            String choice = scanner.nextLine().trim();

            if (choice.equals("6")) {
                System.out.println("Goodbye!");
                break;
            }

            handleChoice(choice);
        }
    }
}