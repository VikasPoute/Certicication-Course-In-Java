package FunctionsAndMethods;

import java.util.Scanner;

public class SumOf {
    private static Scanner sc = new Scanner(System.in);

    public static int printSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = printSum(a, b);
        System.out.println(ans);
    }
}
