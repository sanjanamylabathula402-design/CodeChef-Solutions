}
    print("\nSuccess! You linked " + report[0].my_comments.length + " comments to " + report[0].username);
} else {
    print("The 'my_comments' array is missing. Check your $lookup syntax!");
if (report.length > 0 && report[0].my_comments) {
    printjson(report);