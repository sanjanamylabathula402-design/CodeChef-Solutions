# POLMDB52

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Luxury Feature Filter
- You are managing the property_db. Users are complaining that searching for "Apartments" that have specific "Amenities" (like a "Pool") is becoming slow.
- Your Goal: Create a Compound Index that handles both a single value field (type) and an array field (amenities). This will result in a Compound Multikey Index.
- Identify the Two Keys: You need to index the field that stores the building category and the field that stores the list of features.
- Order Matters: In a compound index, it is usually best to put the field you filter by most (or the one that narrows down the results the most) first.
- The "Multikey" Magic: You don't need to do anything special for the array field. MongoDB will see the array and automatically treat that part of the index as a "Multikey."

 **Challenge Check** 

- Total Docs Examined: Before your index, this should be 3,000.
- Target: After your index, the number of documents examined should drop to roughly 250–375 (only the specific apartments that actually have a pool).

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T06:41:03.516Z  

```cpp
}).explain("executionStats");

print("Documents scanned BEFORE index: " + slowSearch.executionStats.totalDocsExamined);

db.listings.createIndex({ type: 1, amenities: 1 });

const fastSearch = db.listings.find({
    type: "Apartment",
    amenities: "Solar"
}).explain("executionStats");

print("Documents scanned AFTER index: " + fastSearch.executionStats.totalDocsExamined);

```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB52)