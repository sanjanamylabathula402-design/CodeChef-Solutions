
print("--- Before Optimization ---");
print("Strategy: " + beforeStats.queryPlanner.winningPlan.stage);
print("Docs Examined: " + beforeStats.executionStats.totalDocsExamined);

db.logs.createIndex({ logId: 1 });

const afterStats = db.logs.find({ logId: "LOG_1500" }).explain("executionStats");

print("\n--- After Optimization ---");
print("Strategy: " + afterStats.queryPlanner.winningPlan.stage);
print("Docs Examined: " + afterStats.executionStats.totalDocsExamined);
