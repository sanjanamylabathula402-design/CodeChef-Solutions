  { username: "john_doe" },
  { $inc: { likes: 1 } }
);
// --- STEP 3: UPDATE ---
db.guestbook.updateOne(
print("Post after creation:");
printjson(post);


// --- STEP 2: READ ---
const post = db.guestbook.findOne({ username: "john_doe" });
  likes: 0
});
db.guestbook.insertOne({
  username: "john_doe",
  message: "Hello! This is my first guestbook post.",

// --- STEP 1: CREATE ---