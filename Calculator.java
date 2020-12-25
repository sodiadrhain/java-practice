import java.util.Scanner;

public class Calculator {
    static Scanner myInput = new Scanner(System.in);
    static double firstNum;
    static double secondNum;

    public static void main(String[] args) {
        System.out.println("Select an Operation");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        System.out.print("Enter Operation: ");
        int userOperation = myInput.nextInt();

        System.out.println("Enter first number: ");
        firstNum = myInput.nextInt();

        System.out.println("Enter second number");
        secondNum = myInput.nextInt();

        if (userOperation == 1) {
            add();
        } else if (userOperation == 2) {
            subtract();
        } else if (userOperation == 3) {
            multiply();
        } else if (userOperation == 4) {
            divide();
        } else {
            System.out.println("Invalid operation selected, please try again");
        }
    }

    private static void add() {
        System.out.println("Result: " + (firstNum + secondNum));
    }

    private static void subtract() {
        System.out.println("Result: " + (firstNum - secondNum));
    }

    private static void multiply() {
        System.out.println("Result: " + (firstNum * secondNum));
    }

    private static void divide() {
        double division = (double) firstNum/secondNum;
        System.out.println("Result: " + division);
    }
}
