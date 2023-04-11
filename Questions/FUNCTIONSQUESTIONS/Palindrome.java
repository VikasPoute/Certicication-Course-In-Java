package Questions.FUNCTIONSQUESTIONS;

public class Palindrome {

    public static void toCheckPalindrome(int n) {
        int copy = n;
        int original = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            original = original * 10 + lastDigit;
            n = n / 10;
        }

        if (copy == original)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");

    }

    public static void main(String[] args) {
        int n = 122;
        toCheckPalindrome(n);
    }

}
