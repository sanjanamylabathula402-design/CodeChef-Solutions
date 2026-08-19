# JAPROB31

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Contact Manager - View Contacts

Now that we can add contacts, let's implement the  **View Contacts**  functionality.

We will allow users to  **view all saved contacts**  in a structured format.

### Task

Update the `viewContacts()` function to achieve the following:

- If no contacts exist, display "No contacts available.".
- Otherwise, print all contacts in a clear format: Each contact should be displayed as Name: Phone Number. Iterate through the names and phones lists and display all stored contacts.
### Expected Output

```
Choose an option (1-6): 2
Contact List:
Anuj: 9315077888

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:04:57.459Z  

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

[View on CodeChef](https://www.codechef.com/problems/JAPROB31)