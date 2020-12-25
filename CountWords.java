import java.util.Scanner;

public class CountWords {
    static Scanner myInput = new Scanner(System.in);

    public static void main(String[] args) {
        // enter a string of words
        // system tells how many words is entered

        System.out.print("Enter a simple sentence: ");
        String userInput = myInput.nextLine();
        
        int count = 0;

        for (int i = 0; i<userInput.length(); i++) {
            if (userInput.charAt(i) == ' ') {
                count ++ ;
            }
        }
        System.out.println(count + 1);
    }

}
