package VariablesAndDataTypes;

import java.util.Scanner;

/**
 * SumOfAB
 */
public class SumOfAB {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(sum);

    }
}