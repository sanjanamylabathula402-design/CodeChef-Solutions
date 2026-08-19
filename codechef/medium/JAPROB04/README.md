# JAPROB04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Todo List Application - Validate Date

When adding a task to the to-do list, it’s important to validate the user’s input, especially the deadline. The user must enter a valid date in the correct format, rather than random text or an invalid date like "32-02-2025".

In Java, we can handle this easily using the `SimpleDateFormat` class, which allows us to parse a date string and ensure it follows a specified format. We will use "`dd-MM-yyyy`" as our required format.

```
SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
dateFormat.setLenient(false);

Date date = dateFormat.parse(deadline);
System.out.print(date);

```

```
Wed Apr 09 00:00:00 UTC 2025

```

 **What if User enters something random instead of date?** 
It will give an error, and my program will stop. No, we don’t want that. To avoid this, we will use try-catch, which we studied earlier. Whenever I get a runtime error, instead of breaking my code with an error message, I will handle it and continue my program by showing my own error message.

 **Strict Date Validation with setLenient(false):** 
`setLenient(false)` enforces strict date validation, rejecting invalid values (like 31-02-2023). Without it, Java would automatically 'correct' malformed dates (e.g., interpreting 31/02 as 03/03).

### Task

Modify the `validateDate()` method to ensure that the deadline entered by the user follows the DD-MM-YYYY format.

- Validate dates using SimpleDateFormat class.
- Use setLenient(false) to reject invalid dates (like 31-02-2023)
- Return the parsed Date object if valid.
- If an error occurs (invalid format or incorrect date): Print: "Invalid date format! Please enter the deadline in DD-MM-YYYY format.". Return null.
- We have to use a try-catch block because parse() raises an exception.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:38:26.892Z  

```cpp

        System.out.println("Welcome to the To-Do List Application!");

        while (true) {
            System.out.println("Choose one operation:");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            String value = userChoice(choice, taskNames, taskDeadlines, scanner);

            if ("Exiting application. Goodbye!".equals(value)) {
                System.out.println(value);
                break;
            }
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB04)