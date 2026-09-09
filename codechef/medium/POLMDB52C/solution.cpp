  items: "Burger"
}).forEach(doc => printjson(doc));


// Query array field
db.orders.find({