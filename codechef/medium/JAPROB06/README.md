# JAPROB06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Todo List Application - Displaying Tasks

Now that we can add tasks to ArrayLists (taskNames and taskDeadlines), let's now move forward and display them in a structured manner.

We'll iterate both Arraylists simultaneously to display each task with its deadline.

### Task

Update the `displayTasks()` function to meet the following requirements:

- If there are no tasks available, display message: "No tasks available.".
- For existing tasks: Print a header: "Your Tasks:" Display each task with: Task number (index + 1) Task name Deadline formatted as DD-MM-YYYY (using SimpleDateFormat) String formattedDeadline = dateFormat.format(taskDeadlines.get(index));
### Expected Output

```
Your Tasks:
1. Project report - Deadline: 22-05-2025

```

 **Click on 'Run' button**, add a few tasks, and see if your displayTasks() method is working perfectly!

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:41:10.419Z  

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

[View on CodeChef](https://www.codechef.com/problems/JAPROB06)