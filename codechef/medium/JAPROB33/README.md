# JAPROB33

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Contact Manager - Update Contact

Now that we can search for contacts, let's add the ability to update them.

This feature allows users to modify an existing contact's name or phone number.

### Task

Complete the `updateContact()` function to ensure it meets the following requirements:

- Accept user input for the existing contact name.
- Check if the name exists in the names list: If it does not exist, display: Contact not found! If it exists, prompt the user to: Enter a new name (or press Enter to keep the same). Enter a new phone number (or press Enter to keep the same).
- If the user enters a new phone number, validate it: The phone number should be exactly 10 digits. If invalid, display: Invalid phone number!
- If valid details are provided, update the contact accordingly.
- Display a success message: Contact updated successfully!
### Expected Output

```
Choose an option (1-6): 4
Enter the contact name to update: Anuj
Enter new name (press Enter to keep same): Anuj Sharma
Enter new phone number (press Enter to keep same): 9876543210
Contact updated successfully!

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:05:58.382Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB33)