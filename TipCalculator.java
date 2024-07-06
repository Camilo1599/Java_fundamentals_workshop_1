import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the bill amount: ");
        double bill = scanner.nextDouble();

        System.out.println("Enter the tip percentage: ");
        double tip = scanner.nextDouble();

        double tipAmount = bill * tip / 100;

        System.out.println("The tip amount is: " + tipAmount);
        System.out.println("The total amount is: " + (bill + tipAmount));
        scanner.close();
    }
}
