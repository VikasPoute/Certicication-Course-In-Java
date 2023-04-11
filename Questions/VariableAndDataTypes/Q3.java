package Questions.VariableAndDataTypes;

import java.util.Scanner;

/**
 * Q3
 */
public class Q3 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        float pen = sc.nextFloat();
        float pencile = sc.nextFloat();
        float rubber = sc.nextFloat();

        float totalBill = (pen + pencile + rubber);
        System.out.println(totalBill);

        float withGstBill = totalBill + (0.18f * totalBill);
        System.out.println(withGstBill);
    }
}