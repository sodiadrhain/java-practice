import java.util.Scanner;


public class AddInput {
    public static Scanner myInput = new Scanner(System.in);
    public static void main(String[] args) {
        getInputs();
    }

    private static int addInputs(int myFirstInput, int mySecondInput) {
        return myFirstInput + mySecondInput;
    }

    private static void getInputs() {
        System.out.print("Enter first input: ");
        int myFirstInput = myInput.nextInt();
        System.out.print("Enter second input: ");
        int mySecondInput = myInput.nextInt();
        int result = addInputs(myFirstInput, mySecondInput);
        System.out.println("Addition of "+myFirstInput+" and "+mySecondInput+" = "+result);
    }
}
