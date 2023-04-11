package BST;

import java.util.ArrayList;

public class BSTTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int data) { // Building the bst
        if (root == null) {
            return new Node(data);
        }

        if (root.data > data) {
            root.left = insert(root.left, data);
        }

        if (root.data < data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public static void inorder(Node root) { // printing the bst in inorder
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int val) { // Search the node in bst
        if (root == null) {
            return false;
        }

        if (root.data == val) {
            return true;
        }

        if (root.data > val) {
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }

    public static Node delete(Node root, int val) { // Delete the node from bst
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // Case 1 -> leaf Node
            if (root.left == null && root.right == null) { // Case 1
                return null;
            }

            // Case 2 -> single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3 -> both children
            Node IS = findInorderSuccessor(root.right); // IS -> Inorder Successor
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data > k2) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("null");
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }

        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        // int val[] = { 5, 1, 3, 4, 2, 7 };
        // int val[] = { 3, 5, 2, 1, 4, 8, 9, 10, 6, 7 };
        int val[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        Node root = null;

        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }

        inorder(root);

        System.out.println();

        // if (search(root, 8)) {
        // System.out.println("Found");
        // } else {
        // System.out.println("Not found");
        // }

        // root = delete(root, 5);
        // System.out.println();
        // inorder(root);

        // printInRange(root, 5, 12);
        printRootToLeaf(root, new ArrayList<Integer>());
    }
}
