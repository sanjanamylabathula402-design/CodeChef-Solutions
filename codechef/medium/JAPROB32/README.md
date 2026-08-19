# JAPROB32

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Contact Manager - Search Contacts

Now that we can view all contacts, let's implement the  **Search Contacts**  feature.

This feature allows users to search for a contact by name and display their phone number.

### Task

Update the `searchContact()` function to achieve the following:

- Accept a name from the user as input.
- Search if the name exists in the names list: If found, display the contact as Name: Phone Number.
- If not found, display: "Contact not found!".
### Expected Output

```
Choose an option (1-6): 3
Enter name to search: Anuj
Anuj: 9315077888

Choose an option (1-6): 3
Enter name to search: Rahul
Contact not found!

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:05:35.178Z  

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

[View on CodeChef](https://www.codechef.com/problems/JAPROB32)