print("Step 6: After $addToSet");

db.books.updateOne(
  { genre: "Programming" },
  {
    $addToSet: {
      borrowers: "Alice"
    }
  }
);

db.books.find({}).forEach(doc => printjson(doc));
