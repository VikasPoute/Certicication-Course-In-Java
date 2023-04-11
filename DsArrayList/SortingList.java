package DsArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list + " -->  Default List");
        Collections.sort(list);
        System.out.println(list + " -->  Asending Sorted List");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list + " -->  Desending Sorted List");
    }
}
