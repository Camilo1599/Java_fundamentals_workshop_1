import java.util.Scanner;


public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int addition, subtraction, multiplication, division;


        System.out.println("Por favor ingrese un numero A: ");
        int numA = scanner.nextInt();

        System.out.println("Por favor ingrese un numero B: ");
        int numB = scanner.nextInt();
        
        System.out.println("EL numero a es: " + numA + " el numero B es: " + numB);
        
        addition = numA + numB;
        subtraction = numA -numB;
        multiplication = numA*numB;
        division = numA/numB;

        System.out.println("La suma es: " + addition);
        System.out.println("La resta es: " + subtraction);
        System.out.println("La multiplicacion es: " + multiplication);
        System.out.println("La division es: " + division);
        scanner.close();
    }

}