import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mile =  0.621371;
        double kilometers;
        double distanceMiles;

        System.out.print("Enter your dintance in kilometers: ");
        kilometers = scanner.nextInt();

        distanceMiles = kilometers*mile;

        System.out.println("Your distance in miles is: " + distanceMiles);

        scanner.close();



    }
}
