});

const result = db.books.findOne({ title: "The Go Programming Language" });

print("Successfully inserted book:");
printjson(result);
        name: "Addison-Wesley",
        year: 2015
    }
db = connect('mongodb://localhost:27017/library_db');

db.books.insertOne({
    title: "The Go Programming Language",
    isbn: "978-0134190440",
    authors: ["Alan A. A. Donovan", "Brian W. Kernighan"],
    publisher: {