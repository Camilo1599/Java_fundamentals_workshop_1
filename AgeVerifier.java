import java.util.Scanner;


public class AgeVerifier{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your age:  ");
        int age = scanner.nextInt();

        if(age < 18){
            System.out.println("you are too young");
        } else {
            System.out.println("You are already of age");
        }

        scanner.close();
    }
}