import java.util.Arrays;

public class FirstAndLast {
    // returns first and last element of Array
    public static void main(String[] args) {
        int[] myArray = new int[]{1,2,3,4,5,6};
        
        System.out.println("Array is: " + Arrays.toString(myArray));
        System.out.println("First: " + myArray[0]);
        System.out.println("Last: " + (myArray[myArray.length-1]));
    }
}
