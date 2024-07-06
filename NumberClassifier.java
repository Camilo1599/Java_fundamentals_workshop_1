import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Number: ");
        Double number = scanner.nextDouble();
        if (number%2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

        if (number == 0) {
            System.out.println("Your number is zero");
        } else if (number > 0) {
            System.out.println("Your number is positive");
        } else {
            System.out.println("Your number is negative");
        }

        scanner.close();
    }
}
