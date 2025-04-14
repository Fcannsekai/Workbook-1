
import java.util.Scanner;

class newCalculator {

    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        String option;
        float answer;
        float firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextFloat();

        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextFloat();

        System.out.println("Possible calculations:\n(A)-Add\n(S)-Subtract\n(M)-Multiply\n(D)-Divide");
        System.out.print("Please select an option: ");
        option = scanner.next();

        if (option.equalsIgnoreCase("M")) {
            answer = firstNumber * secondNumber;
            System.out.printf("Answer is: %.2f%n", answer);
        } else if (option.equalsIgnoreCase("A")) {
            answer = firstNumber + secondNumber;
            System.out.printf("Answer is: %.2f%n", answer);
        } else if (option.equalsIgnoreCase("S")) {
            answer = firstNumber - secondNumber;
            System.out.printf("Answer is: %.2f%n", answer);
        } else if (option.equalsIgnoreCase("D")) {
            if (secondNumber == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                answer = firstNumber / secondNumber;
                System.out.printf("Answer is: %.2f%n", answer);
            }
        } else {
            System.out.println("Invalid option");
        }

        scanner.close();
    }
}