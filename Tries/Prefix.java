package Tries;

public class Prefix {
    static class Node {
        Node childrens[] = new Node[26];
        boolean eow = false;
        int freq = 1;

        public Node() {
            for (int i = 0; i < childrens.length; i++) {
                childrens[i] = null;
            }

            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.childrens[idx] == null) {
                curr.childrens[idx] = new Node();
            } else {
                curr.childrens[idx].freq++;
            }
            curr = curr.childrens[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans) {
        if (root == null) {
            return;
        }

        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < root.childrens.length; i++) {
            if (root.childrens[i] != null) {
                findPrefix(root.childrens[i], ans + (char) +(i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };

        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        root.freq = -1;

        findPrefix(root, "");
    }
}
