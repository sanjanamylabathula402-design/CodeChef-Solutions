
// Aggregation pipeline (Solution: Apply pagination)
var pagedb = db.articles.aggregate([
  { $skip: 2 },   // Skip first 2 documents
  { $limit: 3 }   // Limit to next 3 documents
]).toArray();

// Print result
printjson(pagedb);

// Store result in separate collection
db.paginatedArticles.insertMany(pagedb);
