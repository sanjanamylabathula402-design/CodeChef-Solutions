# POLMDB05B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task - Hybrid Marketplace

 **Your Goal:**  Create a collection named products and insert two documents with different `"shapes"` to see how MongoDB handles varied data.

 **Step 1:**  Complete the "Shirt" Document
Locate the first db.products.insertOne block.

- Replace the ____ labels with the keys size and material.
- Replace the "____" values with your own data (e.g., "Extra Large" and "Organic Cotton").

 **Step 2:**  Complete the `"Camera"` Document
Locate the second `db.products.insertOne` block in the same collection.

- Replace the ____ labels with the keys megapixels and is_waterproof.
- Crucial: For megapixels, enter a Number (e.g., 48). For is_waterproof, enter a Boolean (true or false).

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T08:46:43.628Z  

```cpp
  material: "Organic Cotton"
});

// DOCUMENT 2: A Camera (Focus on Tech fields)
db.products.insertOne({
  size: "Extra Large",
  // Added fields
  price: 59.99,
  category: "Clothing",
db.products.drop();

// --- YOUR TASK START ---

// DOCUMENT 1: A Shirt (Focus on Clothing fields)
db.products.insertOne({
  item_name: "Vintage Denim Jacket",

const db = connect('mongodb://localhost:27017/marketplace_db');
```

---

[View on CodeChef](https://www.codechef.com/problems/POLMDB05B)