import java.util.Scanner;

public class BmiChecker {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your weight: ");
        int userWeight = userInput.nextInt();
        System.out.print("Enter your height: ");
        float userHeight = userInput.nextFloat();
        double values = calculateBmi(userWeight, userHeight);
        System.out.println("Your BMI is: " + values);
        System.out.println(checkBmi(values));
    }

    private static double calculateBmi(int weight, float height) {
        final float BMI = weight/height;
        return BMI;
    }

    private static String checkBmi(double bmi) {
        final String bmiResponse;
        if (bmi >= 25) {
            bmiResponse = "You are overweight";
        } else if (bmi >= 18) {
            bmiResponse = "Your weight is normal";
        } else {
            bmiResponse = "You are underweight";
        }

        return bmiResponse;
    }
}
