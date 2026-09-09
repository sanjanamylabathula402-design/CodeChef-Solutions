# POLPROB220

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem

You are managing a flights collection:

```
db.flights.insertMany([
  { _id: 1, airline: "Air India",   source: "Delhi",   destination: "Mumbai",  duration: 120 },
  { _id: 2, airline: "IndiGo",      source: "Delhi",   destination: "Bangalore", duration: 150 },
  { _id: 3, airline: "SpiceJet",    source: "Delhi",   destination: "Mumbai",  duration: 110 },
  { _id: 4, airline: "Vistara",     source: "Delhi",   destination: "Mumbai",  duration: 130 },
  { _id: 5, airline: "GoAir",       source: "Pune",    destination: "Delhi",   duration: 140 }
]);

```

 **👉 Task :** 

- Create a composite index on { source: 1, destination: 1 }.
- Write a query to find all flights from Delhi to Mumbai, sorted by duration (ascending).

 **🎯 Expected Output :** 

```
[
  { _id: 3, airline: "SpiceJet", source: "Delhi", destination: "Mumbai", duration: 110 },
  { _id: 1, airline: "Air India", source: "Delhi", destination: "Mumbai", duration: 120 },
  { _id: 4, airline: "Vistara", source: "Delhi", destination: "Mumbai", duration: 130 }
]

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T06:39:23.753Z  

```cpp
// Step 1: Create a composite index on (source: 1, destination: 1)
db.flights.createIndex({ source: 1, destination: 1 });

// Step 2: Query flights from Delhi to Mumbai, sorted by duration ascending
const result = db.flights.find(
  { source: "Delhi", destination: "Mumbai" }
).sort({ duration: 1 }).toArray();

// Store results in separate collection for testing
db.queryResults.insertMany(result);

printjson(result);

```

---

[View on CodeChef](https://www.codechef.com/problems/POLPROB220)