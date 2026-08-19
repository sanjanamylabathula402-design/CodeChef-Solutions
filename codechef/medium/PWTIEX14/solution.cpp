// Class representing a student using instance variables
class Codechef {
    // Step 1: Declare instance variables (fields)
    int studentId;  // Stores student ID
    String studentName;  // Stores student name

    public static void main(String[] args) {
        // Step 2: Create two student objects
        Codechef s1 = new Codechef();
        Codechef s2 = new Codechef();

        // Step 3: Assign values to instance variables for each object
        s1.studentId = 1;
        s1.studentName = "Rahul";

        s2.studentId = 2;
        s2.studentName = "Sneha";

        // Step 4: Display instance variable values for each student
        System.out.println("Student 1: ID = " + s1.studentId + ", Name = " + s1.studentName);
        System.out.println("Student 2: ID = " + s2.studentId + ", Name = " + s2.studentName);
    }
}
