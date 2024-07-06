import java.util.Scanner;

public class RatingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your exam grade (1-100): ");
        int examGrade= scanner.nextInt();

        if (examGrade <= 100 && examGrade >= 90) {
            System.out.println("Your grade is A");
        } else if (examGrade < 90 && examGrade >= 80) {
            System.out.println("Your grade is B");
        } else if (examGrade < 80 && examGrade >= 70) {
            System.out.println("Your grade is C");
        } else if (examGrade < 70 && examGrade >= 60) {
            System.out.println("Your grade is D");
        } else if (examGrade < 60 && examGrade >= 0) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Invalid grade");
        }

        scanner.close();
    }
}
