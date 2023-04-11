package Tries;

public class TestTrie {

    static class Node {

        Node childrens[] = new Node[26];
        boolean eow = false; // eow -> End Of Word

        Node() {
            for (int i = 0; i < 26; i++) {
                childrens[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.childrens[idx] == null) {
                curr.childrens[idx] = new Node();
            }
            curr = curr.childrens[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.childrens[idx] == null) {
                return false;
            }
            curr = curr.childrens[idx];
        }

        return curr.eow == true;
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "thee" };
        for (String string : words) {
            insert(string);
        }
        System.out.println(search("thee"));
        System.out.println(search("thor"));
        System.out.println(search("any"));
        System.out.println(search("an"));
    }
}
