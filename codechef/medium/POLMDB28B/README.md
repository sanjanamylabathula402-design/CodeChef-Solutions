# POLMDB28B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Premium Membership Manager

You are managing the member database for a streaming platform. One of your users, "Sophia", has just upgraded to a "Premium" plan. Additionally, an old test account with the email "test@example.com" needs to be removed to keep the database clean.

 **Task** 
Write a script in `index.js` to perform the following two operations in the `members` collection of the `streaming_db` database:

 **1. Update Sophia's Profile** 
Use `updateOne` and the `$set` operator to change Sophia's plan to `"Premium"` and set her `isActive` status to `true`.

 **2. Remove the Test Account** 
Use `deleteOne` to permanently remove the document where the email is `"test@example.com"`.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T08:58:19.719Z  

```cpp
    }
);

db.members.deleteOne({ email: "test@example.com" });

const updatedSophia = db.members.findOne({ name: "Sophia" });
const testAccount = db.members.findOne({ email: "test@example.com" });

print("--- Sophia's Updated Profile ---");
printjson(updatedSophia);

print("--- Test Account Existence Check ---");
print("Is test account still there? " + (testAccount !== null));
```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB28B)