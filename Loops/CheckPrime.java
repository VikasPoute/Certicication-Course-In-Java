package Loops;

import java.util.Scanner;

public class CheckPrime {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        boolean check = false;

        if (n == 2) {
            System.out.println("This is prime number.....");
        } else {

            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = true;
                }
            }

            if (check) {
                System.out.println("This is non prime number........");
            } else {
                System.out.println("This is prime number........");
            }
        }
    }
}
