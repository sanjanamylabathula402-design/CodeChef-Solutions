class Variable {
    // variable
    int value;
}

public class Main {
    public static void main(String[] args) {
        // object creation for rectangle class
        Variable v1 = new Variable();
        v1.value = 3;
        Variable v2 = v1;
        v2.value = 7;
        System.out.println("Value of v1 is "+ v1.value);
        System.out.println("Value of v2 is "+ v2.value);
    }
}