# POLPROB160D

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### group - Practice Problem

In this exercise, you will work with `orders` collection:

 **Problems** 

 **1. Count total orders per category** 

Group orders by `category` and count how many orders are there in each category.  **Expected Output:** 

```
[
  { "_id": "Electronics", "totalOrders": 3 },
  { "_id": "Clothing", "totalOrders": 2 }
]

```

 **2. Total revenue per category** 

Calculate the revenue for each order as `price * quantity`. Then group by `category` and calculate the  **total revenue**.  **Expected Output:** 

```
[
  {
    _id: 'Clothing',
    totalRevenue: 330
  },
  {
    _id: 'Electronics',
    totalRevenue: 2600
  }
]

```

 **3. Average order value per customer** 

Find the average value of orders placed by each customer. Use `price * quantity` for each order’s value.  **Expected Output:** 

```
[
  { "_id": "Alice", "avgOrderValue": 440 },
  { "_id": "Bob", "avgOrderValue": 625 },
  { "_id": "Charlie", "avgOrderValue": 800 }
]

```

 **4. Count delivered orders** 

Count how many orders have the status `"Delivered"`.  **Expected Output:** 

```
[
  { "_id": "DeliveredOrders", "totalDelivered": 4 }
]

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T07:17:03.142Z  

```cpp
let problem4 = db.orders.aggregate([
  { $match: { status: "Delivered" } },
  {
    $group: {
      _id: "DeliveredOrders",
      totalDelivered: { $sum: 1 }
    }
  }
]).toArray();
print("Problem 4 Output:");
printjson(problem4);
db.problemResults.insertOne({ problem: 4, output: problem4 });

```

---

[View on CodeChef](https://www.codechef.com/problems/POLPROB160D)