import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your option:\n1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n3.Exit");
        int option = scanner.nextInt();
        if(option == 1) {
            System.out.println("Enter the temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        } else if(option == 2) {
            System.out.println("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.println("The temperature in Celsius is: " + celsius);
        } else if(option == 3) {
            System.out.println("Bye, Thank you ");
        }

        scanner.close();
    }
}
