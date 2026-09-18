
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println();

        System.out.print("Search for? ");
        String input = scanner.nextLine();
        boolean isFound = false;

        for (String name: list) {
            if (name.equals(input)) {
                isFound = true;
            }
        }

        if (isFound) {
            System.out.println(input + " was found!");
        } else {
            System.out.println(input + " was not found!");
        }
    }
}
