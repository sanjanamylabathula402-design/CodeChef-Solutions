# POLMDB34F

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Library Search Engine

You have an `employees` collection in the `company_db`. The HR department wants to create a  **"Public Directory"**  on the office TV screen. It should show the employee's name and department, but it must  **hide**  their internal `employeeId` and their `salary` for privacy reasons.

 **Step 1: Identify your target fields** 

- We want to see name and dept.
- In MongoDB, to include a field, you set it to 1 in the projection object.

 **Step 2: Hide the "Uninvited Guest"** 

- MongoDB always includes the _id field by default, even if you didn't ask for it.
- To make the directory look professional and clean, you must explicitly set _id to 0.

 **Step 3: The "Silent" Exclusion** 

Because we are using an  **Inclusion strategy**  (setting fields to `1`), any field we don't mention (like `salary` and `employeeId`) will be automatically hidden by MongoDB.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T05:36:22.118Z  

```cpp
db = connect('mongodb://localhost:27017/company_db');

db.employees.insertMany([
    { name: "Suresh Kumar", dept: "Engineering", salary: 75000, employeeId: "ENG-001" },
    { name: "Ananya Rao", dept: "Marketing", salary: 62000, employeeId: "MKT-042" },
    { name: "Ishaan Singh", dept: "HR", salary: 58000, employeeId: "HR-101" }
]);

const publicDirectory = db.employees.find(
    {}, 
    { 
        name: 1, 
        dept: 1, 
        _id: 0 
    }
).toArray();


```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB34F)