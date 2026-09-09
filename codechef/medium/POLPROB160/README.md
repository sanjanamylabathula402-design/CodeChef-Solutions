# POLPROB160

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### project - Practice Problem

You have a MongoDB collection called `employees`:

```
[
  { name: "John", age: 28, salary: 50000, department: "HR" },
  { name: "Alice", age: 32, salary: 75000, department: "Engineering" },
  { name: "Bob", age: 24, salary: 40000, department: "Marketing" },
  { name: "Eve", age: 29, salary: 60000, department: "Engineering" }
]

```

 **Task** 

- Use $project to include only the name and salary fields.
- Add a new computed field called senior: true if age >= 30 false otherwise
- Exclude _id from the output.

 **Expected Output** 

```
[
  { name: "John", salary: 50000, senior: false },
  { name: "Alice", salary: 75000, senior: true },
  { name: "Bob", salary: 40000, senior: false },
  { name: "Eve", salary: 60000, senior: false }
]

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T07:11:29.069Z  

```cpp
        // Exclude the _id field from output
        _id: 0
      }
    }
  ]).toArray();
  
  // Print the result
  printjson(result);
  db.results.insertMany(result);


  

```

---

[View on CodeChef](https://www.codechef.com/problems/POLPROB160)