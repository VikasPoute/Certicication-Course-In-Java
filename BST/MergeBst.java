package BST;

import java.util.ArrayList;

public class MergeBst {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }

    public static Node createBST(ArrayList<Integer> list, int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(list.get(mid));

        root.left = createBST(list, start, mid - 1);
        root.right = createBST(list, mid + 1, end);

        return root;
    }

    public static Node mergeBST(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return null;
        }

        // Step 1
        ArrayList<Integer> list1 = new ArrayList<>();
        getInorder(root1, list1);

        // Step 2
        ArrayList<Integer> list2 = new ArrayList<>();
        getInorder(root2, list2);

        // Step 3
        ArrayList<Integer> finalList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                finalList.add(list1.get(i));
                i++;
            } else {
                finalList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            finalList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            finalList.add(list2.get(j));
            j++;
        }

        // Step 4
        return createBST(finalList, 0, finalList.size() - 1);
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        /*
         * 
         *   2
         *  / \
         * 1   4
         * 
         */

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
         * 
         *   9
         *  / \
         * 3  12
         * 
         */

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        /*
         * 
         *        3
         *     /     \
         *    1       9
         *    \     /   \
         *     2   4     12
         * 
         */

        Node root = mergeBST(root1, root2);
        preOrder(root);
    }
}
