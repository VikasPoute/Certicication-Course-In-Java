package Hashing;

import java.util.HashSet;

public class CountDistentElement {
    public static void main(String[] args) {
        int nums[] = {4,3,2,5,6,7,3,4,2,1};

        HashSet<Integer> set = new HashSet<>();

        for (Integer integer : nums) {
            set.add(integer);
        }

        System.out.println(set.size());
    }
}
