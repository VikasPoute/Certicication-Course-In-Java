package DsArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TrappingRainWater {
    public static int trappedRainWater(ArrayList<Integer> height) {

        // calculate left max boundary
        ArrayList<Integer> leftMax = new ArrayList<>();
        leftMax.add(height.get(0));
        for (int i = 1; i < height.size(); i++) {
            leftMax.add(Math.max(height.get(i), leftMax.get(i - 1)));
        }

        Collections.reverse(height);
        // calculate right max boundary
        ArrayList<Integer> rightMax = new ArrayList<>();
        rightMax.add(height.get(0));
        for (int i = 1; i < height.size(); i++) {
            rightMax.add(Math.max(height.get(i), rightMax.get(i - 1)));
        }

        Collections.reverse(rightMax);
        Collections.reverse(height);
        
        int trappedWater = 0;
        // loop
        for (int i = 0; i < height.size(); i++) {

            int waterLevel = Math.min(leftMax.get(i), rightMax.get(i));
            trappedWater += waterLevel - height.get(i);
        }

        return trappedWater;
    }

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>();
        height.add(4);
        height.add(2);
        height.add(0);
        height.add(6);
        height.add(3);
        height.add(2);
        height.add(5);

        System.out.println(trappedRainWater(height));
    }
}
