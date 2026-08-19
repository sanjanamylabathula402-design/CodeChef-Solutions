# JAPROB30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Contact Manager - Add Contacts

Now that we have set up user input handling, your task is to implement the `addContact()` function. This function should allow users to add a contact by entering a name and a phone number while ensuring proper validation.

### Task

Complete the `addContact()` function to meet the following requirements:

- Accept user input for: Contact name (as a string). Contact phone number (as a string).
- Validate the input: The name should not be empty. The phone number should: Only contain digits. Be exactly 10 digits long. If invalid, print: Invalid input!
- Check for duplicate contact names: If a contact with the same name already exists in the list, print: Contact already exists!
- If the input is valid and the contact is not a duplicate: Add the contact to both names and phones lists. Print the success message: Contact added successfully!

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:04:32.697Z  

```cpp

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

```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB30)