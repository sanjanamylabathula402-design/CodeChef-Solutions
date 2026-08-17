# ZWFPSZ35

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Exam Scores

Write a program to calculate the `total` and `average` score of three subjects: `Math`, `Science`, and `English`. This will help track a student's overall performance by combining multiple user inputs.

 **Steps to Complete:** 

- Read three different subject scores from the user.
- Use arithmetic operations to calculate the total and average scores.
- Display the results in a structured format.
### Sample 1:
Input
Output

```
80
90
85
```

```
Total Score: 255
Average Score: 85.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:29:55.580Z  

```java
import java.util.Scanner; // Import the Scanner class to read user input

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the Math score from the user
        int mathScore = scanner.nextInt();

        // Read the Science score from the user
        int scienceScore = scanner.nextInt();

        // Read the English score from the user
        int englishScore = scanner.nextInt();

        // Calculate the total score by adding the individual scores
        int totalScore = mathScore + scienceScore + englishScore;

        // Calculate the average score by dividing the total by the number of subjects
        double averageScore = totalScore / 3.0;

        // Print the total score
        System.out.println("Total Score: " + totalScore);

        // Print the average score
        System.out.println("Average Score: " + averageScore);

        // Close the Scanner to release system resources
        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ZWFPSZ35)