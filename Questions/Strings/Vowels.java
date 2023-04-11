package Questions.Strings;

import java.util.Scanner;

public class Vowels {
    private static Scanner sc = new Scanner(System.in);

    public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = sc.nextLine();
        int ans = countVowels(str);
        System.out.println(ans);
    }
}
