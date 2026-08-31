    email: "ishaan@codechef.com",
    role: "Fullstack Developer",
    joinedYear: 2024
});

const verifiedMember = db.members.findOne({ email: "ishaan@codechef.com" });

if (verifiedMember) {
    print("Verification Successful! Member found:");
    printjson(verifiedMember);
} else {
    print("Verification Failed: Member not found.");
}