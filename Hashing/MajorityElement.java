package Hashing;

import Hashing.HashMapCode.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]))
                hm.put(nums[i], hm.get(nums[i]) + 1);
            else
                hm.put(nums[i], 1);
        }

        for (int i : hm.keySet()) {
            if (hm.get(i) >= nums.length / 3) {
                System.out.println(i);
            }
        }
    }
}
