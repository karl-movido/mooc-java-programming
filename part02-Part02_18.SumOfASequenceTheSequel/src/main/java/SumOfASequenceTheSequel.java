
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextInt());
        System.out.print("Second number? ");
        int second = Integer.valueOf(scanner.nextInt());
        int total = 0;

        for (int i = first; i <= second; i++) {
            total += i;
        }

        System.out.println("The sum is: " + total);

        scanner.close();

    }
}
