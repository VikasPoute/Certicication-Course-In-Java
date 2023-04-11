package BST;

/**
 * AVLTree
 */
public class AVLTree {

    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return root.height;
    }

    public static int getBalance(Node root) {
        if (root == null) {
            return 0;
        }

        return height(root.left) - height(root.right);
    }

    public static Node leftRotation(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update height
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        // Return new root
        return y;
    }

    public static Node rightRotation(Node y) {
        Node x = y.left;
        Node t2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = t2;

        // Update height
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        // Return new root
        return x;
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root;
        }

        // Update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // get balance factor
        int bf = getBalance(root);

        // Left Left case
        if (bf > 1 && key < root.left.data) {
            return rightRotation(root);
        }

        // Right Right case
        if (bf < -1 && key > root.right.data) {
            return leftRotation(root);
        }

        // Left Right Case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }

        if (bf < -1 && key < root.right.data) {
            root.right = rightRotation(root.right);
            return leftRotation(root);
        }

        return root;
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
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        preOrder(root);
    }
}