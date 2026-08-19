# JAPROB34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Contact Manager - Delete Contact

Now that we can update contacts, let's add a feature to  **delete**  them.

This functionality allows users to  **remove a contact permanently**  from the contact list.

### Task

Update the `deleteContact()` function to:

- Accept the contact name as input.
- If the contact exists (case-insensitive match), delete it from the names and phones lists and display a confirmation message: Contact deleted successfully!
- If the contact does not exist, display: Contact not found!
### Expected Output

```
Choose an option (1-6): 5
Enter name to delete: Anuj
Contact deleted successfully!

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:06:15.864Z  

```cpp
    }

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

[View on CodeChef](https://www.codechef.com/problems/JAPROB34)