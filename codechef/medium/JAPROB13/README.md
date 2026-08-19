# JAPROB13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Quiz Game - Displaying Questions

In this component, we are focused on displaying the questions in a structured format.

 **Task** 

- Implement the function displayQuestion() that takes two parameters: question_data - A String array containing the question, its options and correct answer. question_number - An integer representing the question number.

This function should print the question in the following format:

```
====================
Question 1: Which keyword is used to create a subclass in Java?
A) implements
B) extends
C) inherits
D) override

```

- Update playQuiz() function to: Call displayQuestion() function for each question. Ensure that each question has a correct question number, starting from 1.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:44:36.412Z  

```cpp
        question[3] = optC;   
        question[4] = optD;   
        question[5] = correctAns;
        return question;
    }

    public static void countdownTimer() {
        System.out.println("\nYou have 10 seconds to think...");
        try {
            for (int i = 10; i > 0; i--) {
                System.out.print("\rTime left: " + i + " seconds ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted.");
        }
        System.out.println("\n");
    }
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB13)