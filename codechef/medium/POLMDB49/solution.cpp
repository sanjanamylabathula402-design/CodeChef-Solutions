        department: "Engineering"
    });
}
db.staff.insertMany(employees);

const slowSearch = db.staff.find({ empId: 4500 }).explain("executionStats");
print("Documents scanned before index: " + slowSearch.executionStats.totalDocsExamined);

db.staff.createIndex({ empId: 1 });

const fastSearch = db.staff.find({ empId: 4500 }).explain("executionStats");
print("Documents scanned after index: " + fastSearch.executionStats.totalDocsExamined);
