package Questions.VariableAndDataTypes;

import java.util.Scanner;

/**
 * Q1
 */
public class Q1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = (a + b + c) / 3;

        System.out.println(avg);

    }
}