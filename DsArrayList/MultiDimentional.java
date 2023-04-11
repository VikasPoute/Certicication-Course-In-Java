package DsArrayList;

import java.util.ArrayList;

public class MultiDimentional {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(); // Creating a new array list1
        ArrayList<Integer> list2 = new ArrayList<>(); // Creating a new array list2
        ArrayList<Integer> list3 = new ArrayList<>(); // Creating a new array list3

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1); // 1 2 3 4 5
            list2.add(i * 2); // 2 4 6 8 10
            list3.add(i * 3); // 3 6 9 12 15
        }

        mainList.add(list1); // adding the list under the mainList
        mainList.add(list2); // adding the list2 under the mainList
        mainList.add(list3); // adding the list3 under the mainList

        System.out.println(mainList);
        System.out.println();

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i); // here, currList get the lists of mainList
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

    }
}
