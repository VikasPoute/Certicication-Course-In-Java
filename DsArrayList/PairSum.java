package DsArrayList;

import java.util.ArrayList;

public class PairSum {

    // optimized approach two pointers approach
    public static boolean pairSum2(ArrayList<Integer> list, int target) {

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            if (list.get(i) + list.get(j) == target) {
                return true;
            } else if (list.get(i) + list.get(j) > target) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }

    // Brut Force
    public static boolean pairSum1(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(pairSum1(list, target));
        System.out.println(pairSum2(list, target));
    }
}
