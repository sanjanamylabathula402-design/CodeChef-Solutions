# JXDJHO15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-17T16:10:46.859Z  

```java
class Employee {
    String name;
    int id;
    String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }

    // Implement the toString method here
    @Override
  public String toString() {
        return "Employee[name=" + name + ", id=" + id + ", designation=" + designation + "]";
  }
}

class Codechef {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Bob Smith", 1001, "Software Engineer");
        
        System.out.println(employee1);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JXDJHO15)