package DsArrayList;

import java.util.ArrayList;

public class WaterContainer {

    public static int waterLevel(ArrayList<Integer> height) {

        int i = 0;
        int j = height.size() - 1;
        int maxWater = 0;

        while (i < j) {
            int ht = Math.min(height.get(i), height.get(j));
            int wid = j - i;
            int water = ht * wid;
            maxWater = Math.max(maxWater, water);

            if (height.get(i) < height.get(j)) {
                i++;
            } else {
                j--;
            }

        }

        return maxWater;
    }

    public static int containsWater(ArrayList<Integer> height) {

        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {

                int ht = Math.min(height.get(i), height.get(j));
                int wid = j - i;
                int water = ht * wid;

                maxWater = Math.max(maxWater, water);
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(containsWater(height));

        System.out.println(waterLevel(height));

    }
}
