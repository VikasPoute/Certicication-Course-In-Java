package BackTracking;

public class Permutation {
    public static void printPermutations(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // rucersion
        for (int i = 0; i < str.length(); i++) {

            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newStr, ans + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "");
    }
}
