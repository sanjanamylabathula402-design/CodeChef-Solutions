# POLMDB58

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Library Search Optimizer

Users of the  **Global Library app**  are complaining about slow performance when searching for books. The most common query is:

- Filter: genre: "Fantasy" (Equality)
- Filter: pages: { $gt: 500 } (Range)
- Sort: publishedYear: -1 (Sort)

Your current index is `{ genre: 1, pages: 1, publishedYear: -1 }`. While it works, it is inefficient because it  **violates the ESR Rule**, forcing MongoDB to perform an  **in-memory sort**.

- Follow the ESR Rule: In Step 2, create your index using the order: Equality field, then Sort field, then Range field.
- Verify the Plan: In Step 3, use.explain("executionStats") on the search query.
- The Goal: When you run the script, "Manual Sort Required" should change from YES to NO. This proves MongoDB is now picking up the data in the pre-sorted order!

 **Expected Output** 

```
Generating 50,000 documents for a real-world test...
--- CASE 1: WRONG ORDER (E-R-S) ---
Did MongoDB need an extra SORT stage? YES (Bad)
Keys Examined: 6286

--- CASE 2: ESR RULE (E-S-R) ---
Did MongoDB need an extra SORT stage? NO (Excellent)
Keys Examined: 6362

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T06:47:21.250Z  

```cpp
print("Keys Examined: " + badStats.executionStats.totalKeysExamined);

db.books.dropIndexes();
db.books.createIndex({ genre: 1, publishedYear: -1, pages: 1 });

const goodStats = db.books.find({ genre: "Fantasy", pages: { $gt: 500 } })
                          .sort({ publishedYear: -1 })
                          .explain("executionStats");

print("\n--- CASE 2: ESR RULE (E-S-R) ---");
const goodNeedsSort = JSON.stringify(goodStats.queryPlanner.winningPlan).includes('"stage":"SORT"');
print("Manual In-Memory Sort Required: " + (goodNeedsSort ? "YES" : "NO (Excellent)"));
print("Keys Examined: " + goodStats.executionStats.totalKeysExamined);
```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB58)