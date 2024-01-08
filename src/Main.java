import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       THIS COMMENTED SECTION IS FOR THE EXERCISES WE DID DURING THE LESSON!!! BELOW IS THE HOMEWORK!!!
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            try {
//                System.out.println("Enter the numerator: ");
//                int numerator = scanner.nextInt();
//                System.out.println("Enter the denominator");
//                int denominator = scanner.nextInt();
//                if (denominator == 0) {
//                    throw new ArithmeticException();
//                }
//                double result = numerator / (double) denominator;
//                System.out.println("Result: " + result);
//
//
//            } catch (ArithmeticException e) {
//                System.out.println("Error: Division by zero is not allowed.");
//            } catch (InputMismatchException e) {
//                System.out.println("Error: Invalid input. Please enter valid numbers.");
//                scanner.nextLine();
//            }
//            System.out.println("Do you want to continue? (y/n)");
//            String answer = scanner.next();
//            if (answer.equals("n")) {
//                System.out.println("Goodbye!");
//                break;
//            }
//
//
//        }
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        BasicCalculator basicCalculator = new BasicCalculator();
        while (true) {
            try {
                System.out.println("Enter the first operand: ");
                double operand1 = scanner.nextDouble();
                System.out.println("Enter the operator: the options are +, -, *, / ");
                String operator = scanner.next();
                System.out.println("Enter the second operand: ");
                double operand2 = scanner.nextDouble();

                switch (operator) {
                    case "+":
                        System.out.println("Result: " + basicCalculator.add(operand1, operand2));
                        break;
                    case "-":
                        System.out.println("Result: " + basicCalculator.subtract(operand1, operand2));
                        break;
                    case "*":
                        System.out.println("Result: " + basicCalculator.multiply(operand1, operand2));
                        break;
                    case "/":
                        System.out.println("Result: " + basicCalculator.divide(operand1, operand2));
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter valid numbers.");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Invalid operator. Please enter a valid operator.");
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


