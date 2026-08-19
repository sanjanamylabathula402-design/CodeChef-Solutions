# JAPROB12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Quiz Game - Countdown Timer

In this Component, we will develop the  **Countdown Timer**, which will be used in our project to give users 10 seconds to think before answering a question.
The timer should display the remaining time dynamically and update the same line every second to ensure a clean interface.

### Task
- Implement the function countdownTimer(), which should display a countdown of 10 seconds.
- First, print the line: "You have 10 seconds to think..."
- Use the carriage return character \r to overwrite the previous output with the updated time left. The output format should be: "Time left: {i} seconds"
- The carriage return (\r) is a special escape character used to move the cursor to the beginning of the current line without advancing to the next line.

```
System.out.print("\rTime left: " + i + " seconds ");

```

- Update the time remaining every second using the Thread.sleep() function.
- Thread.sleep() in Java is used to pause the execution of the current thread for a specified number of milliseconds (or second argument (optional) - Nanoseconds for extra precision).

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:43:56.403Z  

```cpp
        String[] question = new String[6];
        question[0] = text;   
        question[1] = optA; 
        question[2] = optB;
        question[3] = optC;   
        question[4] = optD;   
        question[5] = correctAns;
        return question;
    }

    public static void playQuiz() {
        ArrayList<String[]> questions = getJavaQuestions();

        Collections.shuffle(questions);

        countdownTimer();
    }

```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB12)