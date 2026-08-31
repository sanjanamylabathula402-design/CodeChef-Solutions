    }
);

db.members.deleteOne({ email: "test@example.com" });

const updatedSophia = db.members.findOne({ name: "Sophia" });
const testAccount = db.members.findOne({ email: "test@example.com" });

print("--- Sophia's Updated Profile ---");
printjson(updatedSophia);

print("--- Test Account Existence Check ---");
print("Is test account still there? " + (testAccount !== null));