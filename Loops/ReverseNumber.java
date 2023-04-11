package Loops;

/**
 * ReverseNumber
 */
public class ReverseNumber {

    public static void main(String[] args) {
        int n = 10899;
        int ans = 0;

        while (n > 0) {
            int rem = n % 10;
            ans = (ans * 10) + rem;
            n = n / 10;
        }

        System.out.println(ans);
    }
}