package BackTracking;

public class SubString {

    public static void printSubStrings(String str, String ans, int i) {
        if (str.length() == i) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }

            return;
        }

        // choice is YES
        printSubStrings(str, ans + str.charAt(i), i + 1);
        // choice is NO
        printSubStrings(str, ans, i + 1);
    }

    public static void main(String[] args) {

        String str = "abc";
        printSubStrings(str, "", 0);
    }
}
