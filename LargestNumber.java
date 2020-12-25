public class LargestNumber {
    public static void main(String[] args) {
        System.out.println(maxTwoNumbers(21,3));
        System.out.println(maxThreeNumbers(41,43,14));
    }
    
    static int maxTwoNumbers(int first, int second) {
        if (first >= second) {
            return first;
        } else {
            return second;
        }
    }

    static int maxThreeNumbers(int first, int second, int third) {
        if (first >= second && first >= third) {
            return first;
        } else if (second >= first && second >= third) {
            return second;
        } else {
            return third;
        }
    }
}
