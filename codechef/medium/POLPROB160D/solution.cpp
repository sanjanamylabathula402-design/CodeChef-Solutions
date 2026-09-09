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
