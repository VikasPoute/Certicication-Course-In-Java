package Questions.FUNCTIONSQUESTIONS;

import java.util.Scanner;

public class AvrageOfThree {
    private static Scanner sc = new Scanner(System.in);

    public static int computeAvg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = computeAvg(a, b, c);
        System.out.println(avg);
    }

}
