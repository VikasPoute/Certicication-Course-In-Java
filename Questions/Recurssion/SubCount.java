package Questions.Recurssion;

public class SubCount {
    public static int countSubStr(String str, int i, int j, int n) {
        if (n == 1)
            return 1;

        if (n <= 0)
            return 0;

        int result = countSubStr(str, i + 1, j, n - 1) + countSubStr(str, i, j - 1, n - 1)
                - countSubStr(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            result++;
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        int ans = countSubStr(str, 0, n - 1, n);
        System.out.println(ans);

    }
}
