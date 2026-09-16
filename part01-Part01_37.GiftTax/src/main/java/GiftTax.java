
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of gift? ");
        int value = Integer.valueOf(scan.nextLine());
        
        int taxLimit = 0;
        int taxLower = 0;
        double taxRate = 0;
        
        if (value < 5000) {
            System.out.println("No tax!");
        } else {
            if (value >= 5000 && value < 25000) {
                taxLimit = 100;
                taxLower = 5000;
                taxRate = 0.08;
            } else if (value >= 25000 && value < 55000 ) {
                taxLimit = 1700;
                taxLower = 25000;
                taxRate = 0.1;
            } else if (value >= 55000 && value < 200000) {
                taxLimit = 4700;
                taxLower = 55000;
                taxRate = 0.12;
            } else if (value >= 200000 && value < 1000000) {
                taxLimit =  22100;
                taxLower = 200000;
                taxRate = 0.15;
            } else if (value >= 1000000) {
                taxLimit = 142100;
                taxLower = 1000000;
                taxRate = 0.17;
            }
            
            double result = taxLimit + (value - taxLower) * taxRate;
            
            System.out.println("Tax: " + result);
        }
    }
}
