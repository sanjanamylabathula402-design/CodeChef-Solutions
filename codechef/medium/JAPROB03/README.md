# JAPROB03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Todo List Application - User Input

Let us begin and create the project step by step.

- We've set up the skeleton structure of the project in the IDE. Take a moment to review all the functions.
- The program execution starts from the main function, where it first displays a welcome message and presents the user with a set of options. Two ArrayLists taskNames for storing task names and taskDeadlines for storing deadlines are used to manage the tasks. Based on the user's input, the corresponding function will be called.
- As the first step, let's choose an action: Add a Task, Delete a Task, or Display Tasks, and then invoke the appropriate function accordingly.
### Task

Update the `userChoice()` function to achieve the following.

Accept the user input as one of either '1', '2', '3' or '4'

- If the user input is 1 Ask the user for the task name with the prompt - "Enter task name:" and accept a string input. Ask the user for the deadline of task with the prompt - "Enter deadline (DD-MM-YYYY):" and accept a string input. Call the addTask() function, passing taskNames, taskDeadlines, taskName and deadline as parameters.
- If the user input is 2 Ask the user for the task number with the prompt - "Enter task number to delete:" and accept a string input using scanner.nextLine() and parse it into an integer using Integer.parseInt(). Call the deleteTask() function, passing taskNames, taskDeadlines, and taskNumber as parameters.
- If the user input is 3 Call the displayTasks() function, passing taskNamesand taskDeadlines as parameters.
- If the user input is 4 The program should return the string "Exiting application. Goodbye!". This string will serve as both the exit message and the signal to terminate the program.
- If the user input is anything else Output "Invalid choice!".

 **Note:**  The `taskNames`and `taskDeadlines` Arraylists must be passed in all functions (addTask(), deleteTask(), and displayTasks()) as we will utilize it in the future.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:38:05.973Z  

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

[View on CodeChef](https://www.codechef.com/problems/JAPROB03)