# WNDHVZ44

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Exam Eligibility Check

A university requires students to meet multiple conditions to be eligible for final exams. A student must have at least  **75% attendance**  and a  **minimum score of 40 marks**  in internal assessments to be allowed to take the exam.

```
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        int attendancePercentage = 80;
        int internalMarks = 45;

        if (_____) {  // Fill in the blank
            System.out.println("Student is eligible for the final exam.");
        } else {
            System.out.println("Student is not eligible for the final exam.");
        }
    }
}

```

Choose the correct condition to replace `_____` to ensure the correct eligibility?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T09:59:19.854Z  

```cpp
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        // Variables representing eligibility conditions
        boolean hasRegistered = true;
        int attendancePercentage = 80;
        int requiredAttendance = 75;

        // Check if student is registered and meets attendance requirement
        if (hasRegistered && (attendancePercentage >= requiredAttendance)) {
            System.out.println("You are eligible to take the exam.");
        } else {
            System.out.println("You are not eligible to take the exam.");
        }

        System.out.println("Eligibility check completed.");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WNDHVZ44)