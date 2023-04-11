package Questions.Conditional;

import java.util.Scanner;

public class PositiveNegative {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter one number: ");
        int number = sc.nextInt();

        if (number >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
