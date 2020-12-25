import java.util.Scanner;


public class Average {
    static Scanner myInput = new Scanner(System.in);
    public static void main(String[] args) {
        // calculate the average of a range of numbers entered
        int sum = 0;
        System.out.print("How many numbers do you want to find average for? : ");
        int numbers = myInput.nextInt();
        for (int i = 1; i < numbers+1; i++) {
            System.out.print("Enter number "+i+": ");
            int numberInput = myInput.nextInt();
            sum += numberInput;
        }
        float average = (float) sum/numbers;
        System.out.println("Average of numbers is "+average);
    }
}
