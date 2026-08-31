printjson(updatedBook);


// --- STEP 4: DELETE ---
db.books.deleteOne({
  title: "Atomic Habits"
});

const count = db.books.countDocuments();
const allBooks = db.books.find().toArray();

print("Total documents in 'books' collection: " + count);
printjson(allBooks);