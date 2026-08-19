# JAPROB14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Quiz Game - User Answer

In this component, we focus on capturing the user's answer to a multiple-choice question.

 **Task** 

- Implement the function getUserAnswer() that: Prompt the user to enter their answer (A, B, C, or D). Removes extra spaces and converts the input to uppercase. Checks whether the input is a valid option (A, B, C, or D). Returns the answer if valid; otherwise, returns null.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T06:45:29.457Z  

```cpp

    public static void playQuiz() {
        System.out.println("Welcome to Java Quiz!");
        ArrayList<String[]> questions = getJavaQuestions();
        Collections.shuffle(questions);
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int i = 1;

        for (String[] question : questions) {
            displayQuestion(question, i);
            countdownTimer();
            String userAnswer = getUserAnswer(sc);
            System.out.println("your response: "+userAnswer);
        }

    }
    
    public static void main(String[] args) {
        playQuiz();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB14)