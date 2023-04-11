package Patterns;

/**
 * ButterflyPattern
 */
public class ButterflyPattern {

    public static void butterfly_pattern(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // stars -> 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces -> 2*( n - i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // stars -> 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // second half
        for (int i = n; i >= 1; i--) {
            // stars -> 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces -> 2*( n - i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // stars -> 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterfly_pattern(4);
    }
}