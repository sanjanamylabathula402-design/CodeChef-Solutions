# POLMDB25

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Member Directory

You are setting up a database for a new coding club. You need to register a new member and then verify their details using the database to ensure the "Sign-up" process was successful.

 **Task** 
Write a script in `index.js` to perform the following two actions:

 **1. Insert a Member** 
Use `insertOne` to add a document to the `members` collection in the `club_db` database.

- name: "Ishaan Sharma"
- email: "ishaan@codechef.com"
- role: "Fullstack Developer"
- joinedYear: 2024

 **2. Verify the Member** 
Use `findOne` to retrieve the document you just created, specifically searching by the `email` field.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T08:56:34.537Z  

```cpp
    email: "ishaan@codechef.com",
    role: "Fullstack Developer",
    joinedYear: 2024
});

const verifiedMember = db.members.findOne({ email: "ishaan@codechef.com" });

if (verifiedMember) {
    print("Verification Successful! Member found:");
    printjson(verifiedMember);
} else {
    print("Verification Failed: Member not found.");
}
```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB25)