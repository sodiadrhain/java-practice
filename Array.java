public class Array {
    public static void main(String[] args) {
        // Declare an array to hold 5 integers
        int[] myArray = new int[]{9, 2, 3, 4, 6};

        // Print a single element in the array
        System.out.println(myArray[0]);

        // Loop through the array to print every value
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        for (int j: myArray) {
            System.out.println(j);
        }

    }
}
