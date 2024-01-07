import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter the numerator: ");
                int numerator = scanner.nextInt();
                System.out.println("Enter the denominator");
                int denominator = scanner.nextInt();
                if (denominator == 0) {
                    throw new ArithmeticException();
                }
                double result = numerator / (double) denominator;
                System.out.println("Result: " + result);


            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter valid numbers.");
                scanner.nextLine();
            }
            System.out.println("Do you want to continue? (y/n)");
            String answer = scanner.next();
            if (answer.equals("n")) {
                System.out.println("Goodbye!");
                break;
            }


        }
        scanner.close();

    }
}


