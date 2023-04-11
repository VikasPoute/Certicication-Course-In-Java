package Hashing;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for (int i = 0; i < str2.length(); i++) {
            if (map.get(str2.charAt(i)) != null) {
                if (map.get(str2.charAt(i)) == 1) {
                    map.remove(str2.charAt(i));
                } else {
                    map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        System.out.println(isAnagram(str1, str2));
    }
}
