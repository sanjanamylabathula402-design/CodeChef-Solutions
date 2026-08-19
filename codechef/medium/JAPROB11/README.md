# JAPROB11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Quiz Game - Storing Questions

In this component, we aim to store quiz questions in a structured format using an `ArrayList` of String arrays. Each array should contain the question text, four answer options, and the correct answer.

### Task

Below are two quiz questions:

- Which keyword is used to create a subclass in Java? Options: A) implements, B) extends, C) inherits, D) override Correct Answer: B
- What is the output of: System.out.println(10 + 20 + "Java")? Options: A) 30Java, B) Java1020, C) Java30, D) 1020Java Correct Answer: A

Implement the following functions to return these questions as a `ArrayList` of String arrays in the following format:

```
[
    [
       "Which keyword is used to create a subclass in Java?",
       "A) implements",
       "B) extends",
       "C) inherits",
       "D) override",
       "B"
    ]
]

```

- createQuestion() - A helper function that takes:
- The question text
- Four options
- The correct answer
- And returns a String array with these elements in order: [question, optionA, optionB, optionC, optionD, correctAnswer]
- getJavaQuestions() - A function that returns an ArrayList<String[]> containing the above two questions using the createQuestion() helper function.
- playQuiz() - A function that:
- Gets the questions using getJavaQuestions()
- Shuffles the questions using Collections.shuffle()

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:43:03.786Z  

```cpp
    }

    public static String[] createQuestion(String text, String optA, String optB, String optC, String optD, String correctAns) {
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
    }

    public static void main(String[] args) {
        playQuiz();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB11)