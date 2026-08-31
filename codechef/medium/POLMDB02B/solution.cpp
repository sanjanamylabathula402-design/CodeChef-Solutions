  is_available_for_hire: true
});

const myProfile = db.developers.findOne({ name: "Arjun CodeChef" });

print("--- Your Document Database Profile ---");
printjson(myProfile);

if (myProfile && Array.isArray(myProfile.tech_stack) && typeof myProfile.socials === 'object') {
    print("\nSuccess! You've mastered the 'Everything is Together' concept of Documents.");
} else {
    print("\nCheck your document structure. Make sure you have an array and a nested object!");
}