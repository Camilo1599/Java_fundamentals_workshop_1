import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor ingrese su peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Por favor ingrese su altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Tu IMC es: " + imc);

        scanner.close();
    }

    
}
