// Group by customer and calculate totals
db.sales.aggregate([
  {
    $group: {
      _id: "$customer",
      totalAmount: { $sum: "$amount" },
      totalQuantity: { $sum: "$quantity" }
    }
  }
]).forEach(doc => printjson(doc));

