package BinaryTreeDS;

public class TestTree2 {
    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.leftNode);
        int rh = height(root.rightNode);

        return Math.max(lh, rh) + 1;
    }

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = countOfNodes(root.leftNode);
        int rh = countOfNodes(root.rightNode);

        return (lh + rh + 1);
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return sum(root.leftNode) + sum(root.rightNode) + root.data;
    }

    public static int treeDiameter(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.leftNode);
        int leftDiam = treeDiameter(root.leftNode);

        int rh = height(root.rightNode);
        int rightDiam = treeDiameter(root.rightNode);

        int self = lh + rh + 1;

        return Math.max(self, Math.max(rightDiam, leftDiam));
    }

    static class Info {
        int ht;
        int diam;

        Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.leftNode);
        Info rightInfo = diameter(root.rightNode);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), rightInfo.ht + leftInfo.ht + 1);
        int ht = Math.max(rightInfo.ht, leftInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        /*
         *         1
         *       /   \
         *      2     3
         *     / \   / \
         *    4   5 6   7
         */
        Node root = new Node(1);
        root.leftNode = new Node(2);
        root.rightNode = new Node(3);
        root.leftNode.leftNode = new Node(4);
        root.leftNode.rightNode = new Node(5);
        root.rightNode.leftNode = new Node(6);
        root.rightNode.rightNode = new Node(7);
        // System.out.println(height(root));
        // System.out.println(countOfNodes(root));
        // System.out.println(sum(root));
        // System.out.println(treeDiameter(root));
        System.out.println(diameter(root).diam);
    }
}
