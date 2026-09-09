db = connect('mongodb://localhost:27017/company_db');

db.employees.insertMany([
    { name: "Suresh Kumar", dept: "Engineering", salary: 75000, employeeId: "ENG-001" },
    { name: "Ananya Rao", dept: "Marketing", salary: 62000, employeeId: "MKT-042" },
    { name: "Ishaan Singh", dept: "HR", salary: 58000, employeeId: "HR-101" }
]);

const publicDirectory = db.employees.find(
    {}, 
    { 
        name: 1, 
        dept: 1, 
        _id: 0 
    }
).toArray();

