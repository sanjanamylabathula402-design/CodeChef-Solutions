db = connect('mongodb://localhost:27017/management_db');

db.projects.insertOne({
    project_name: "DevWeekend",
    tech_stack: "Spring Boot",
    // Storing multiple values in a single field using an Array
    contributors: ["Ankit", "Sophia", "Ishaan", "Maria"]
});

const projectData = db.projects.findOne({ project_name: "DevWeekend" });

print("Project successfully created:");
printjson(projectData);