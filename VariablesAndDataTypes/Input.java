package VariablesAndDataTypes;

import java.util.Scanner;

/**
 * Input
 */
public class Input {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = sc.next(); // Only one word can store
        System.out.println(input);

        String name = sc.nextLine(); // store full paragraph
        System.out.println(name);

    }
}