});

db.newsletters.updateOne(
    { title: "Daily Tech Digest" },
    { 
        $inc: { subscriberCount: 1 },
        $addToSet: { topics: "Technology" }
    }
);

const result = db.newsletters.findOne({ title: "Daily Tech Digest" });
print("--- Updated Newsletter Stats ---");
printjson(result);