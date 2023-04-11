package VariablesAndDataTypes;

import java.util.Scanner;

/**
 * ProductOf
 */
public class ProductOf {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("The product of a nad b is: " + product);
    }
}