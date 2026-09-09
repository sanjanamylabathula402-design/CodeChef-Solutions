# POLMDB55

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Performance Audit

 **Step 1: Create the Index** 
You need to tell MongoDB to stop scanning the whole collection.
Use `db.logs.createIndex(...)`.
Inside the parentheses, use an object to specify the `logId` field with a value of `1` for ascending order.

 **Step 2: Run the Explain Command** 
Now you must prove the change worked.
Write a standard `db.logs.find(...)` for the ID `"LOG_1500"`.
 **Crucially**, attach `.explain("executionStats")` to the end of that find command.
Assign this entire line to the `afterStats` variable.

 **Expected output** 

- Stage: Changes from COLLSCAN to IXSCAN.
- Docs Examined: Drops from 3000 to 1.

MongoDB shows only the top-tier operation in winningPlan.stage. To see the underlying IXSCAN (index scan), inspect the full plan using: `printjson(afterStats.queryPlanner.winningPlan)`

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T06:43:22.229Z  

```cpp

print("--- Before Optimization ---");
print("Strategy: " + beforeStats.queryPlanner.winningPlan.stage);
print("Docs Examined: " + beforeStats.executionStats.totalDocsExamined);

db.logs.createIndex({ logId: 1 });

const afterStats = db.logs.find({ logId: "LOG_1500" }).explain("executionStats");

print("\n--- After Optimization ---");
print("Strategy: " + afterStats.queryPlanner.winningPlan.stage);
print("Docs Examined: " + afterStats.executionStats.totalDocsExamined);

```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB55)