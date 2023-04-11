package DsArrayList;

import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
           maxValue = Math.max(maxValue, list.get(i));
        }

        System.out.println(maxValue);
    }
}
