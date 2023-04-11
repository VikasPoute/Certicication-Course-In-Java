package GreedyAlgorithm;

import java.util.ArrayList;

public class MaxActivities {

    public static void main(String[] args) {

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        int maxAct = 1;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);

        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                al.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println(maxAct);

        for (int i = 0; i < al.size(); i++) {
            System.out.print("A" + al.get(i) + " ");
        }
    }
}
