
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int sum = 0;
        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }

            String[] list = input.split(",");
            sum += Integer.valueOf(list[1]);
            count++;
            String name = list[0];

            if (name.length() > longestName.length()) {
                longestName = name;
            }
            
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
    }
}
