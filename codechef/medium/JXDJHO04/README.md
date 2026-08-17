# JXDJHO04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T16:04:54.323Z  

```java
class StudentRecord {
    private int studentId;
    private String name;

    public StudentRecord(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StudentRecord)) {
            return false;
        }

        StudentRecord other = (StudentRecord) obj;

        return this.studentId == other.studentId && this.name.equals(other.name);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord(123, "Alice");
        StudentRecord student2 = new StudentRecord(123, "Alice");
        StudentRecord student3 = new StudentRecord(456, "Bob");
        StudentRecord student4 = new StudentRecord(123, "Charlie");
        StudentRecord student5 = student1;
        String notAStudent = "Not a student";

        System.out.println("student1.equals(student2): " + student1.equals(student2));
        System.out.println("student1.equals(student3): " + student1.equals(student3));
        System.out.println("student1.equals(student4): " + student1.equals(student4));
        System.out.println("student1.equals(student1): " + student1.equals(student1));
        System.out.println("student1.equals(student5): " + student1.equals(student5));
        System.out.println("student1.equals(null): " + student1.equals(null));
        System.out.println("student1.equals(notAStudent): " + student1.equals(notAStudent));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JXDJHO04)