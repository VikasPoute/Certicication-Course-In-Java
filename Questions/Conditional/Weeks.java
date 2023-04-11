package Questions.Conditional;

import java.util.Scanner;

public class Weeks {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter number from 1 to 7: ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Satursday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter number from 1 to 7.......");
                break;
        }
    }

}
