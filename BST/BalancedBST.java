package BST;

import java.util.ArrayList;

public class BalancedBST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node createBST(int arr[], int st, int ed) {

        if (st > ed) {
            return null;
        }

        int mid = (st + ed) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, ed);

        return root;
    }

    public static void getInorder(ArrayList<Integer> inorder, Node root) {
        if(root == null) {
            return;
        }

        getInorder(inorder, root.left);
        inorder.add(root.data);
        getInorder(inorder, root.right);
    }

    public static Node balancedBST(ArrayList<Integer> inorder, int st, int ed) {
        if(st > ed) {
            return null;
        }

        int mid = (st + ed) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = balancedBST(inorder, st, mid - 1);
        root.right = balancedBST(inorder, mid + 1, ed);

        return root;
    }

    public static Node balancedBST(Node root) {
        if(root == null) {
            return null;
        }

        // inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(inorder, root);

        // Sorted inorder BST
        return balancedBST(inorder, 0, inorder.size() - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

        /* 
         *       8
         *     /   \
         *    5     11
         *   / \   /  \
         *  3   6 10   12
         * 
         * Expected tree
         */

        Node root = createBST(arr, 0, arr.length - 1);
        preOrder(root);

        Node root1 = new Node(8);
        root1.left = new Node(6);
        root1.left.left = new Node(5);
        root1.left.left.left = new Node(3);

        root1.right = new Node(10);
        root1.right.right = new Node(11);
        root1.right.right.right = new Node(12);

        preOrder(balancedBST(root1));
    }
}
