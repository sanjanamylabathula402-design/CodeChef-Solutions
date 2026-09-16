    { $unwind: "$raw_data" },

    { $unwind: "$raw_data.scores" }

]).toArray();

print("--- Final Student Report ---");
if (report.length > 1 && !Array.isArray(report[0].raw_data)) {
    printjson(report);
    print("\nSuccess! Rahul now has " + report.filter(r => r.name === "Rahul").length + " separate documents.");
} else {
    print("Something is wrong. Make sure you used '$' in your unwind path!");
}