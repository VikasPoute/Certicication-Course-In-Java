package BinaryTreeDS;

public class LCA {
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

    public static Node lca(Node root, int n1, int n2) {

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca(root.leftNode, n1, n2);
        Node rightLca = lca(root.rightNode, n1, n2);

        if (leftLca == null) {
            return rightLca;
        }

        if (rightLca == null) {
            return leftLca;
        }

        return root;
    }

    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int dist1 = lcaDist(root.leftNode, n);
        int dist2 = lcaDist(root.rightNode, n);

        if (dist1 == -1 && dist2 == -1) {
            return -1;
        } else if (dist1 == -1) {
            return dist2 + 1;
        } else {
            return dist1 + 1;
        }
    }

    public static int minDist(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }

    public static int kthAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftDist = kthAncestor(root.leftNode, n, k);
        int rightDist = kthAncestor(root.rightNode, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        if (Math.max(leftDist, rightDist) + 1 == k) {
            // return root.data;
            return root.data;
        }

        return -1;
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

        // System.out.println(lca(root, 4, 7).data);
        // System.out.println(minDist(root, 4, 3));
        System.out.println(kthAncestor(root, 4, 3));

    }
}
