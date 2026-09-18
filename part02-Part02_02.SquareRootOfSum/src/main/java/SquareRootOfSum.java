
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextInt());
        int num2 = Integer.valueOf(scanner.nextInt());

        double squareRoot = Math.sqrt(num + num2);

        System.out.println(squareRoot);
    }
}
