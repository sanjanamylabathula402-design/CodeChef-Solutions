# JAPROB15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Quiz Game - Update Score

In this component, we focus on evaluating the user's responses by checking whether their answers are correct and keeping track of their score. We also provide feedback for both correct and incorrect answers.

 **Task** 

- Implement the checkAnswer() function It should compare the user's response with the correct answer and: Print "Answer is correct!" if the answer is right. Print "Your answer is wrong! The correct answer is A." if the answer is incorrect. Return 1 for a correct answer and 0 for an incorrect answer.
- Implement the updateScore() function updateScore() function takes two parameters: score - The user's current score result - represents whether user's answer was correct or incorrect. If result is 1, increase score by 1 If result is 0, the score remains unchanged.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T07:00:48.823Z  

```cpp
        ArrayList<String[]> questions = getJavaQuestions();
        Collections.shuffle(questions);
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int question_number = 1;

        for (String[] question : questions) {
            displayQuestion(question, question_number);
            countdownTimer();
            String userAnswer = getUserAnswer(sc);
            int result = checkAnswer(userAnswer, question[5]);
            score = updateScore(score, result);
            question_number++;
        }

        System.out.println("\nYour final score is: " + score + " / " + questions.size());
        System.out.println("Thanks for playing!");
    }
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB15)