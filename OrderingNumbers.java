import java.util.Scanner;

public class OrderingNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int menor, medio, mayor;
        
        System.out.print("Enter your first number integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your second number integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter your third number integer: ");
        int num3 = scanner.nextInt();
        
        
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }

        System.out.println("The ordered numbers are: " + menor + ", " + medio + ", " + mayor);

        scanner.close();
    }
}
