# POLPROB160K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Sales Data Analysis

Analyze the  **sales**  collection using MongoDB  **Aggregation Pipeline**  stages:

- $match → Filter data
- $project → Transform fields
- $group → Aggregate results

 **Step 1: `$match` – Filter Data** 

- Filter documents where:
- category = "Electronics"
- Use $match stage

 **Step 2: `$project` – Transform Output** 

- Display only: customer product amount
- Exclude _id
- Rename amount to price
- Use $project

 **Step 3: `$group` – Aggregate Data** 

- Group data by customer
- Calculate: Total amount spent ($sum) Total quantity purchased ($sum)
- Use $group

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:10:57.961Z  

```cpp
// Group by customer and calculate totals
db.sales.aggregate([
  {
    $group: {
      _id: "$customer",
      totalAmount: { $sum: "$amount" },
      totalQuantity: { $sum: "$quantity" }
    }
  }
]).forEach(doc => printjson(doc));


```

---

[View on CodeChef](https://www.codechef.com/problems/POLPROB160K)