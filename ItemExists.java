public class ItemExists {
    public static void main(String[] args) {
        String[] myArray = new String[] {"banana", "apple", "peach", "managa", "dates"};
        System.out.println(checkExists(myArray, "date"));   
    }

    static Boolean checkExists(String[] arr, String str) {
        for (String arrs : arr) {
            if (arrs == str) {
                return true;
            }
        }
        return false;
    }
}