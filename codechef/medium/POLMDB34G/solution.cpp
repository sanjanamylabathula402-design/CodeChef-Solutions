
// --- STEP 3: SEARCH ($regex) ---
print("Regex Search Result:");
printjson(
  db.books.find({ title: { $regex: "^The" } }).toArray()
);


// --- STEP 4: PROJECTION ---
print("Projection Result:");
printjson(
  db.books.find({}, { title: 1, author: 1, _id: 0 }).toArray()
);