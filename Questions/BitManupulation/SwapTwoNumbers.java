package Questions.BitManupulation;

public class SwapTwoNumbers {
    public static void swapTwo(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a: " + a + ", b: " + b);
    }

    public static void main(String[] args) {
        swapTwo(3, 2);
    }
}
