package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaProblem {
    public static void main(String[] args) {

        Integer verCost[] = { 2, 1, 3, 1, 4 };
        Integer horCost[] = { 4, 1, 2 };

        Arrays.sort(verCost, Collections.reverseOrder());
        Arrays.sort(horCost, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < horCost.length && v < verCost.length) {
            if (horCost[h] <= verCost[v]) { // vertical cuts
                cost += (verCost[v] * hp);
                vp++;
                v++;
            } else { // Horizontal cuts
                cost += (horCost[h] * vp);
                hp++;
                h++;
            }
        }

        while (h < horCost.length) { // remaining horizontal cuts
            cost += (horCost[h] * vp);
            hp++;
            h++;
        }

        while (v < verCost.length) { // remaining vertical cuts
            cost += (verCost[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost of cutting chocolate in single pice is: " + cost);
    }
}
