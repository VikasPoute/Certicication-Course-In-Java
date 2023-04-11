package BinaryTreeDS;

import java.util.LinkedList;
import java.util.Queue;

public class TestTree {
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

    static class BTree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.leftNode = buildTree(nodes);
            newNode.rightNode = buildTree(nodes);

            return newNode;
        }

        public void preorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.leftNode);
            preorder(root.rightNode);
        }

        public void inorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            inorder(root.leftNode);
            System.out.print(root.data + " ");
            inorder(root.rightNode);
        }

        public void postorder(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }

            postorder(root.leftNode);
            postorder(root.rightNode);
            System.out.print(root.data + " ");
        }

        
        static Queue<Node> q = new LinkedList<>();
        public void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();

                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.leftNode != null) {
                        q.add(currNode.leftNode);
                    }

                    if (currNode.rightNode != null) {
                        q.add(currNode.rightNode);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BTree tree = new BTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.preorder(root);
        // tree.inorder(root);
        // tree.postorder(root);
        tree.levelOrder(root);

    }

}
