// Step 1: Create a composite index on (source: 1, destination: 1)
db.flights.createIndex({ source: 1, destination: 1 });

// Step 2: Query flights from Delhi to Mumbai, sorted by duration ascending
const result = db.flights.find(
  { source: "Delhi", destination: "Mumbai" }
).sort({ duration: 1 }).toArray();

// Store results in separate collection for testing
db.queryResults.insertMany(result);

printjson(result);
