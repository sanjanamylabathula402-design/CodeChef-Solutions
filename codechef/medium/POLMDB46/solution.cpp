}).toArray();


print("--- Honor Roll Search Results ---");
if (honorRoll.length === 0) {
    print("No match found (Correct! Arjun does not have an 'A' in this room).");
} else {
    printjson(honorRoll);
}