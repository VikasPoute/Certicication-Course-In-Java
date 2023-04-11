package FunctionsAndMethods;

/**
 * DecimalToBinary
 */
public class DecimalToBinary {

    public static void decToBin(int dec) {
        int bin = 0;
        int pow = 0;
        int num = dec;

        while (dec > 0) {
            int lastDigigt = dec % 2;
            bin += (int) (lastDigigt * Math.pow(10, pow));
            pow++;
            dec = dec / 2;
        }

        System.out.println("binary of " + num + " is " + bin);

    }

    public static void main(String[] args) {

        decToBin(7);
    }
}