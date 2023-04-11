package GreedyAlgorithm;

public class BalancedStringPartitions {
    public static void main(String[] args) {

        String str = "LRRRRLLRLLRL";
        int l = 0;
        int r = 0;
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }

            if (r == l) {
                ans++;
            }
        }

        System.out.println("The ans is: " + ans);
    }
}
