package BitManupulation;

public class BitOperations {
    public static void evenOrOdd(int n) {
        if ((n & 1) == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0)
            return 0;
        else
            return 1;
    }

    public static int setIthBit(int n, int i) {
        return (n | (1 << i));
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);

        return (n & bitMask);
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int clearIBits(int n, int i) {
        int bitMask = ~(0) << i;
        return n & bitMask;
    }

    public static boolean isPowerOf(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            if ((n & 1) != 0)
                count++;

            n = n >> 1;
        }

        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;

        for (int i = n - 1; i >= 0; i--) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }

            a = a * a;
            n = n >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        // evenOrOdd(1);
        // System.out.println(getIthBit(10, 2));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearIBits(15, 2));
        // System.out.println(isPowerOf(64));
        // System.out.println(countSetBits(15));
        System.out.println(fastExpo(2, 3));
    }
}