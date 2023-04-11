package DsArrayList;

import java.util.ArrayList;

public class RotatedSum {

    public static ArrayList<Integer> pairSum(ArrayList<Integer> list, int target) {

        ArrayList<Integer> result = new ArrayList<>();

        int bp = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int rp = bp;
        int lp = bp + 1;

        while (lp != rp) {

            // case 1
            if (list.get(rp) + list.get(lp) == target) {
                result.add(lp + 1);
                result.add(rp + 1);
                break;
            }

            // case 2
            if (list.get(rp) + list.get(lp) > target) {
                rp = (list.size() + rp - 1) % list.size();
            } else {
                lp = (lp + 1) % list.size();
            }

        }

        return result;

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 21;

        System.out.println(pairSum(list, target));
    }
}
