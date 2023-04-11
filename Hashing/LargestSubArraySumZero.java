package Hashing;

import java.util.HashMap;

public class LargestSubArraySumZero {
    public static void main(String[] args) {

        // int arr[] = { 15, -2, 2, -8, 1, 7, 10 };
        int arr[] = { -1, 1, -1, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        // ....<Sum, index>
        // ....key, value

        int sum = 0;
        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                len = Math.max(len, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        System.out.println(len);
    }
}
