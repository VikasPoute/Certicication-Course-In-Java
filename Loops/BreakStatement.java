package Loops;

import java.util.Scanner;

public class BreakStatement {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
