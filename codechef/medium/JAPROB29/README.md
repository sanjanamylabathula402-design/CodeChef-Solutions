# JAPROB29

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Contact Manager - User Input

Let us begin and create the project step by step.

- We've set up the basic structure of the Java project in the IDE. Take a moment to review all the methods. (We have also declared two global ArrayLists named names and phones, so we don't have to pass them to every method—each method can access them directly.)
- The program execution starts from the main method, where it first presents the user with a list of options. Based on the user’s input, the corresponding method is called using the handleChoice() method.
- As a first step, let us accept user input to choose the desired operation and call the corresponding method.
### Tasks

Update the `handleChoice()` method to achieve the following:

- Accept the user input as one of the options: '1', '2', '3', '4', '5', or '6'.
- Based on the input: '1' → Call the addContact() method. '2' → Call the viewContacts() method. '3' → Call the searchContact() method. '4' → Call the updateContact() method. '5' → Call the deleteContact() method. '6' → Print "Goodbye!".
- If the user input is anything else, display: "Invalid choice!"

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:03:53.679Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/JAPROB29)