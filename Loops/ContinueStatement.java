package Loops;

import java.util.Scanner;

public class ContinueStatement {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        for (;;) {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
            if (n % 10 == 0)
                continue;
            System.out.println(n);
        }
    }
}
