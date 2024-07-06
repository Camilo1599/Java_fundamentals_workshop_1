import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double num1, num2, num3, average;
        System.out.println("Enter 3 qualification: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();
        average = (num1+num2+num3)/3;
        System.out.println("Average: " + average);

        if (average >= 6) {
            System.out.println("congratulations you passed");
        } else {
            System.out.println("Sorry you didn't pass");
        }
        scanner.close();
    }
}
