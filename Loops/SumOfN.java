package Loops;

import java.util.Scanner;

public class SumOfN {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 1;
        int n = sc.nextInt();
        int sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println(sum);
    }

}
