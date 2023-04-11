package Hashing;

import java.util.HashMap;
import java.util.Set;

public class HashMapImplementation {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        // Insert -> O(1)
        hm.put("India", 100);
        hm.put("China", 1500);
        hm.put("US", 50);

        // System.out.println(hm);

        // // size
        // System.out.println(hm.size());

        // // Is Empty
        // System.out.println(hm.isEmpty());
        
        // // remove everyThing
        // hm.clear();
        // System.out.println(hm.isEmpty());

        // // get -> O(1)
        // System.out.println(hm.get("India"));
        // System.out.println(hm.get("Indonesia"));

        // // ContainsKey O(1)
        // System.out.println(hm.containsKey("India")); // True
        // System.out.println(hm.containsKey("Indonesia")); // False

        // // Remove -> O(1)
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);
        
        Set<String> set = hm.keySet();
        for (String key : set) {
            System.out.println(key + " " + hm.get(key));
        }
    }
}
