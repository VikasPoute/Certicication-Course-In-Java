package Questions.Strings;

import java.util.Arrays;

public class Anagrams {
    public static void isAnagrams(String str1, String str2) {

        if (str1.length() == str2.length()) {

            str1.toLowerCase();
            str2.toLowerCase();

            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray, str2CharArray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }

        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        isAnagrams(str1, str2);
    }
}
