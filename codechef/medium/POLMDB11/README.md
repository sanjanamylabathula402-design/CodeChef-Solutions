# POLMDB11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Project Team Tracker

You are building an internal tool for CodeChef to track engineering projects. Each project has a name, a deadline, and a list of team members assigned to it.

 **Task** 
Write a script in `index.js` to insert a document into a collection named `projects`. The document should represent a project called  **"DevWeekend"**.

 **Document Structure Requirements** 
 **Standard fields** 

- project_name: "DevWeekend"
- tech_stack: "Spring Boot"

 **Array field** 

- Create a field named contributors.
- This field must be an array containing the following names as strings: "Ankit" "Sophia" "Ishaan" "Maria"

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T08:50:24.912Z  

```cpp
db = connect('mongodb://localhost:27017/management_db');

db.projects.insertOne({
    project_name: "DevWeekend",
    tech_stack: "Spring Boot",
    // Storing multiple values in a single field using an Array
    contributors: ["Ankit", "Sophia", "Ishaan", "Maria"]
});

const projectData = db.projects.findOne({ project_name: "DevWeekend" });

print("Project successfully created:");
printjson(projectData);
```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB11)