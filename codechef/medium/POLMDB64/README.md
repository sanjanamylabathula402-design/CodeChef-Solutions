# POLMDB64

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Grade Flattener

We have two collections:

- students: Contains student names and their studentId.
- grades: Contains an array of subject scores for each studentId.

Your goal is to use `$lookup` to bring the grades into the student document, and then use `$unwind` so that each individual subject score gets its own document.

- Use $lookup to join the grades collection into the students collection
- Match the field studentId in both collections
- Store the joined result in a new field called raw_data
- Apply the first $unwind on raw_data This removes the array created by $lookup and turns it into a single object
- Apply the second $unwind on raw_data.scores This breaks the scores array so each score becomes its own document

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:13:58.200Z  

```cpp
    { $unwind: "$raw_data" },

    { $unwind: "$raw_data.scores" }

]).toArray();

print("--- Final Student Report ---");
if (report.length > 1 && !Array.isArray(report[0].raw_data)) {
    printjson(report);
    print("\nSuccess! Rahul now has " + report.filter(r => r.name === "Rahul").length + " separate documents.");
} else {
    print("Something is wrong. Make sure you used '$' in your unwind path!");
}
```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB64)