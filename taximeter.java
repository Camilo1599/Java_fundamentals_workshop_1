import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baseFare = 5000;
        double farePerKilometer = 1000;

        System.out.print("Enter the distance of the trip in kilometers: ");
        double distance = scanner.nextDouble();

        double totalCost = baseFare + (distance * farePerKilometer);    

        System.out.println("The total cost of the trip is: $" + totalCost);
        
        scanner.close();

    }
    
}
