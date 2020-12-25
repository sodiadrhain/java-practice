public class BooleanAndCondition {
    public static void main(String[] args) {
        String subject = "Alaye";
        Boolean single = true;

        if (single) {
            System.out.println(subject + " is single");
        } else {
            System.out.println((subject + " is not single"));
        }

        Boolean employed = false;

        if (employed) {
            System.out.println(subject + " is employed");
        } else {
            System.out.println(subject + " is unemployed");
        }

        // using and statement
        if (single && employed) {
            System.out.println(subject + " is single and employed");
        } else {
            System.out.println(subject + " is single and unemployed");
        }

        //using or statement
        if (single || employed) {
            System.out.println(subject + " is single or employed");
        } else {
            System.out.println(subject + " is neither single nor employed");
        }
    }
}
