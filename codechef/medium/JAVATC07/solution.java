import java.util.Scanner;
import java.util.ArrayList;

 class Codechef {
    public static void main(String[] args) {
        // Creating and initializing the ArrayList
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(5);
        myList.add(9);
        myList.add(10);
        myList.add(11);

        Scanner scanner = new Scanner(System.in);

        try {
            // Read user input and convert to integer
            int index = Integer.parseInt(scanner.nextLine());

            // Access the element at the given index
            System.out.println(myList.get(index));
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a number");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range");
        }

        scanner.close();
    }
}
