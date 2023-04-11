package FunctionsAndMethods;

public class BinaryToDecimal {
    public static void binToDec(int n) {
        int dec = 0;
        int pow = 0;
        int num = n;

        for (int i = n; i >= 0; i--) {
            int lastDigit = n % 10;
            dec += (int) (lastDigit * Math.pow(2, pow));
            pow++;

            n = n / 10;
        }

        System.out.println("decimal of " + num + " is " + dec);
    }

    public static void main(String[] args) {
        binToDec(111);
    }
}
