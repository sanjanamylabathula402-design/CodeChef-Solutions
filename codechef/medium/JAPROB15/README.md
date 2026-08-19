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
**Submitted:** 2026-08-19T07:00:42.646Z  

```cpp
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Codechef {

    // Task - Complete the below functions
    //--------------------------------------------------------------
    public static int checkAnswer(String userAnswer, String correctAnswer) {

        if (________) { // Check if the userAnswer is equal to correct answer
            System.out.println("Answer is correct!");
            

            // return 1

        } else {

            System.out.println("Your answer is wrong! The correct answer is " + correctAnswer + ".");
            
            
            //  return 0;
        }

    }


    public static int updateScore(int score, int result) {
```

---

[View on CodeChef](https://www.codechef.com/problems/JAPROB15)