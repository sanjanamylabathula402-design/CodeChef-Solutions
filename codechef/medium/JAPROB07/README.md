# JAPROB07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Todo List Application - Removing Tasks

Now that we can add and display tasks in our To-Do list.
Let us go to the next step and enhance our To-Do list by implementing task removal.

### Task

Update the `userChoice()` function to:

- Check if the task list is empty before attempting to delete a task: If the task list is empty, print: "No tasks available.". and return.
- Call displayTasks() function to show the available tasks before prompting for input.

Update the `deleteTask()` function to:

- Ensure that the task number entered is valid. If the task_number is invalid, print: "Invalid task number!"
- Remove the selected task from both the Arraylists and confirm the deletion with a message: "Task '<task-name>' deleted successfully!".

 **Click on the 'Run' button**, add a few tasks, and then try removing them to see if your deleteTask() function is working correctly!

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:41:41.089Z  

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

[View on CodeChef](https://www.codechef.com/problems/JAPROB07)