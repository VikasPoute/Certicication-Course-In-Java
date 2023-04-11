package ConditionalStatement;

import java.util.Scanner;

public class SwitchStatement {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namaste");
                break;

            case 3:
                System.out.println("Ramram");
                break;

            default:
                System.out.println("Enter valid number");
                break;
        }
    }

}
