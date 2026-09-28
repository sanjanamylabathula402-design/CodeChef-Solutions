import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String n = sc.next();

            int remove = n.length() - 1;

            for (int i = 0; i < n.length() - 1; i++) {
                if (n.charAt(i) > n.charAt(i + 1)) {
                    remove = i;
                    break;
                }
            }

            String result = n.substring(0, remove) + n.substring(remove + 1);

            // Remove leading zeros
            result = result.replaceFirst("^0+", "");

            if (result.isEmpty()) {
                result = "0";
            }

            System.out.println(result);
        }

        sc.close();
    }
}