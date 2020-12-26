import java.util.Scanner;

public class Maths {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        mathMethods();
        feetConversion();
        fahrenheit();
    }

    static void mathMethods() {
        int min = Math.min(2, 3); // find minimum number
        System.out.println(min);

        int max = Math.max(4, 9); // find maximum number
        System.out.println(max);

        double squareRoot = Math.sqrt(16); //find square of number
        System.out.println(squareRoot);

        double num1 = 3;
        double num2 = 8;
        System.out.println(num1+" + "+num2+" = " + (num1 + num2)); // Addition
        System.out.println(num1+" - "+num2+" = " + (num1 - num2)); // Subtraction
        System.out.println(num1+" * "+num2+" = " + (num1 * num2)); // Multiplication
        System.out.println(num1+" / "+num2+" = " + (num1 / num2)); // Division
        System.out.println(num1+" % "+num2+" = " + (num1 % num2)); // Remainder
    }

    static void feetConversion() {
        //converts feet to metres
        double feetValue = 3.28;
        System.out.print("Enter a feet to convert to metre: ");
        double feet = userInput.nextDouble();
        System.out.println("Coversion of: "+feet+"ft to metre is: "+(feet/feetValue)+" metres");

    }

    static void fahrenheit() {
        //fahrenheit to celcius conversion
        System.out.print("Enter fahrenheit to covert to celcius: ");
        double fahrenheit = userInput.nextDouble();
        System.out.println("Coversion of: "+fahrenheit+"F to celcius is: "+((fahrenheit - 32) * 5 / 9)+" degree celcius");
    }
}
