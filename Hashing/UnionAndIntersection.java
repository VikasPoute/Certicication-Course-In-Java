package Hashing;

import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {

        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> set = new HashSet<>();

        for (int it = 0; it < arr1.length; it++) {
            set.add(arr1[it]);
        }

        for (int it = 0; it < arr2.length; it++) {
            set.add(arr2[it]);
        }

        System.out.println("The Union of two sets is: " + set.size());

        set.clear();

        for (int it = 0; it < arr1.length; it++) {
            set.add(arr1[it]);
        }

        int count = 0;

        for (int it = 0; it < arr2.length; it++) {
            if (set.contains(arr2[it])) {
                count++;
                set.remove(arr2[it]);
            }
        }

        System.out.println("The Intersection of two sets is: " + count);

    }
}
