package Questions.BitManupulation;

public class ToPowerTo {
    public static int powerCalc(int n) {
        int ans = 1;
        int x = n;

        while (x > 0) {
            if ((x & 1) != 0) {
                ans = ans * n;
            }

            n = n * n;
            x = x >> 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(powerCalc(2));
    }
}
