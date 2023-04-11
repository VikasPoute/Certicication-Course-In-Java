package VariablesAndDataTypes;

import java.util.Scanner;

/**
 * AreaOfCircle
 */
public class AreaOfCircle {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        float r = sc.nextFloat();
        float py = 3.14f;

        float area = py * r * r;

        System.out.println(area);
    }
}