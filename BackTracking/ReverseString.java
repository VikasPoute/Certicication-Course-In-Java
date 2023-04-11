package BackTracking;

public class ReverseString {

    public static void reverSentence(String str[], int idx) {

        if (idx == 0) {
            System.out.print(str[idx]);
            return;
        }

        System.out.print(str[idx] + " ");
        reverSentence(str, idx - 1);

    }

    public static void main(String[] args) {

        String str = "Vikas Poute";

        String[] ans = str.split(" ");

        // reverseString(str);

        reverSentence(ans, ans.length - 1);

    }
}
