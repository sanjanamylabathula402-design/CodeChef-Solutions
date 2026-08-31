}).toArray();


const eduEditions = db.books.find({ 
    code: { $regex: "EDU$" } 
}).toArray();


print("--- Search Results for 'mongo' ---");
printjson(mongoBooks);

print("--- Educational Editions (Ending in EDU) ---");
printjson(eduEditions);