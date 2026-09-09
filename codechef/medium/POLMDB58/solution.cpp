print("Keys Examined: " + badStats.executionStats.totalKeysExamined);

db.books.dropIndexes();
db.books.createIndex({ genre: 1, publishedYear: -1, pages: 1 });

const goodStats = db.books.find({ genre: "Fantasy", pages: { $gt: 500 } })
                          .sort({ publishedYear: -1 })
                          .explain("executionStats");

print("\n--- CASE 2: ESR RULE (E-S-R) ---");
const goodNeedsSort = JSON.stringify(goodStats.queryPlanner.winningPlan).includes('"stage":"SORT"');
print("Manual In-Memory Sort Required: " + (goodNeedsSort ? "YES" : "NO (Excellent)"));
print("Keys Examined: " + goodStats.executionStats.totalKeysExamined);