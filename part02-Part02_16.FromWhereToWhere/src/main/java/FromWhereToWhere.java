
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here 
        System.out.print("Where to? ");
        int to = Integer.valueOf(scanner.nextInt());
        int from = Integer.valueOf(scanner.nextInt());

        for (int i = from; i <= to; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
