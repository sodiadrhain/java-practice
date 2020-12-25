import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static Random myRandNumber = new Random();
    static Scanner userInputs = new Scanner(System.in);
    public static void main(String[] args) {        
        System.out.println("Welcome to Guess Number");
        System.out.println("1 - Easy");
        System.out.println("2 - Medium");
        System.out.println("3 - Hard");
        System.out.print("Choose a mode: ");
        int mode = userInputs.nextInt();

        if (mode == 1) {
            easy();
        } else if (mode == 2) {
            medium();
        } else if (mode == 3) {
            hard();
        } else {
            System.out.println("Invalid mode seleted, please try again");
        }
    }

    private static void easy() {
        System.out.println("Welcome to easy mode");
        System.out.println("You have seven(7) trials to make");
        System.out.println("Guess numbers between 0 and 10");
        int easyRandNumber = myRandNumber.nextInt(10);
        System.out.print("Enter your guess: ");
        int easyInput = userInputs.nextInt();
        int guessLimit = 7;
        for (int i=0; i<guessLimit; i++) {
            if (easyInput == easyRandNumber) {
                System.out.println("You guessed right, Number is: " + easyRandNumber);
                return;
            }

            System.out.println("You are wrong");
            System.out.print("Enter a new guess: ");
            easyInput = userInputs.nextInt();
        }

        System.out.println("You used up all your guessess try again, (Random number is: "+easyRandNumber+")");

    }

    private static void medium() {
        System.out.println("Welcome to medium mode");
        System.out.println("You have five(5) trials to make");
        System.out.println("Guess numbers between 0 and 15");
        int mediumRandNumber = myRandNumber.nextInt(15);
        System.out.print("Enter your guess: ");
        int mediumInput = userInputs.nextInt();
        int guessLimit = 5;
        for (int i=0; i<guessLimit; i++) {
            if (mediumInput == mediumRandNumber) {
                System.out.println("You guessed right, Number is: " + mediumRandNumber);
                return;
            }

            System.out.println("You are wrong");
            System.out.print("Enter a new guess: ");
            mediumInput = userInputs.nextInt();
        }

        System.out.println("You used up all your guessess try again, (Random number is: "+mediumRandNumber+")");
    }

    private static void hard() {
        System.out.println("Welcome to hard mode");
        System.out.println("You have three(3) trials to make");
        System.out.println("Guess numbers between 0 and 30");
        int hardRandNumber = myRandNumber.nextInt(30);
        System.out.print("Enter your guess: ");
        int hardInput = userInputs.nextInt();
        int guessLimit = 3;
        for (int i=0; i<guessLimit; i++) {
            if (hardInput == hardRandNumber) {
                System.out.println("You guessed right, Number is: " + hardRandNumber);
                return;
            }

            System.out.println("You are wrong");
            System.out.print("Enter a new guess: ");
            hardInput = userInputs.nextInt();
        }

        System.out.println("You used up all your guessess try again, (Random number is: "+hardRandNumber+")");
    }
}
