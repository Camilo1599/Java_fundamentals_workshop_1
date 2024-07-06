import java.util.Scanner;

public class InteractiveMenu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;
        System.out.println("Chosse an Option:\nMENU\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
        option = scanner.nextInt();

        System.out.println("Enter your first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = scanner.nextInt();

        switch(option){
            case 1:
                System.out.println("Add: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction: " + (num1-num2));
                break;
            case 3:
                System.out.println("Multiplication: " + (num1*num2));
                break;
            case 4:
                System.out.println("Division: " + (num1/num2));
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

        scanner.close();
    }    
}
