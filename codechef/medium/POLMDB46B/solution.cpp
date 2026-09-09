  "items.name": { $regex: "Piz" }
}).forEach(doc => printjson(doc));


print("Step 4: Combined Query Result");

// Find orders where item price > 100 AND customer is "Rahul"
db.orders.find({
  "items.price": { $gt: 100 },
  customer: "Rahul"
}).forEach(doc => printjson(doc));

