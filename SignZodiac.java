import java.util.Scanner;

public class SignZodiac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your month number (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the number of your day of birth: ");
        int dia = scanner.nextInt();

        String sign = "";

        switch (month) {
            case 1: // Enero
                if (dia <= 19) {
                    sign = "Capricorn";
                } else {
                    sign = "Aquarium";
                }
                break;
            case 2: // Febrero
                if (dia <= 18) {
                    sign = "Aquarium";
                } else {
                    sign = "Pisces";
                }
                break;
            case 3: // Marzo
                if (dia <= 20) {
                    sign = "Pisces";
                } else {
                    sign = "Aries";
                }
                break;
            case 4: // Abril
                if (dia <= 19) {
                    sign = "Aries";
                } else {
                    sign = "Taurus";
                }
                break;
            case 5: // Mayo
                if (dia <= 20) {
                    sign = "Taurus";
                } else {
                    sign = "Gemini";
                }
                break;
            case 6: // Junio
                if (dia <= 20) {
                    sign = "Gemini";
                } else {
                    sign = "Cáncer";
                }
                break;
            case 7: // Julio
                if (dia <= 22) {
                    sign = "Cáncer";
                } else {
                    sign = "Leo";
                }
                break;
            case 8: // Agosto
                if (dia <= 22) {
                    sign = "Leo";
                } else {
                    sign = "Virgo";
                }
                break;
            case 9: // Septiembre
                if (dia <= 22) {
                    sign = "Virgo";
                } else {
                    sign = "Libra";
                }
                break;
            case 10: // Octubre
                if (dia <= 22) {
                    sign = "Libra";
                } else {
                    sign = "Scorpio";
                }
                break;
            case 11: // Noviembre
                if (dia <= 21) {
                    sign = "Scorpio";
                } else {
                    sign = "Sagittarius";
                }
                break;
            case 12: // Diciembre
                if (dia <= 21) {
                    sign = "Sagittarius";
                } else {
                    sign = "Capricorn";
                }
                break;
            default:
                System.out.println("invalid month entered.");
                break;
        }

        
        System.out.println("Your zodiac sign is: " + sign);

        scanner.close();
    }
}
