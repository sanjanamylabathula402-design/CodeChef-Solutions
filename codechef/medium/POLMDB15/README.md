# POLMDB15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Tech Store Catalog

You are developing a backend for an electronics store. You need to store different types of inventory—specifically Smartphones and Gift Cards—in a single collection named `products`.

 **Task** 
Write a script in `index.js` to insert two distinct documents into the `products` collection within a database named `store_db`.

 **Document 1 (Smartphone)** 

- name: "Galaxy S24"
- category: "Electronics"
- specs: { "ram": "8GB", "storage": "256GB" } (nested document)

 **Document 2 (Gift Card)** 

- name: "Gaming Credits"
- value: 50
- currency: "USD"
- redeemable: true

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T08:52:34.000Z  

```cpp
db.products.insertMany([
    {
        name: "Galaxy S24",
        category: "Electronics",
        specs: { 
            ram: "8GB", 
            storage: "256GB" 
        }
    },
    {
        name: "Gaming Credits",
        value: 50,
        currency: "USD",
        redeemable: true
    }
]);

// 3. Verification
```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB15)