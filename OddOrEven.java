public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(check(4));
    }

    static String check(int number) {
        if (number % 2 == 0) {
            return number+" is even";
        } else {
            return number+" is odd";
        }
    }
}
