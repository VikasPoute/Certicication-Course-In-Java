package Questions.VariableAndDataTypes;

import java.util.Scanner;

/**
 * Q2
 */
public class Q2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int side = sc.nextInt();

        int ans = side * side;

        System.out.println(ans);
    }
}