package LinkedList;

public class LinkedList {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    public static Node headNode;
    public static Node tailNode;
    public static int size;

    // Adding element in first
    public void addFirst(int data) {

        // Creating a new node
        Node newNode = new Node(data);
        size++;
        if (headNode == null) { // corner case
            headNode = tailNode = newNode;
            return;
        }

        newNode.next = headNode;
        headNode = newNode;
    }

    // adding element in last
    public void addLast(int data) {

        // Creating new Node
        Node newNode = new Node(data);
        size++;

        if (headNode == null) { // corner case
            headNode = tailNode = newNode;
            return;
        }

        tailNode.next = newNode;
        tailNode = newNode;
    }

    // adding data into the index number
    public void add(int idx, int data) {

        if (idx == 0) { // cornre case
            addFirst(data);
            return;
        }
        // Creating a new node

        Node newNode = new Node(data);
        size++;
        Node tempNode = headNode;
        int i = 0;

        while (i < idx - 1) { // i < idx - 1 --> temp --> prev
            tempNode = tempNode.next;
            i++;
        }

        newNode.next = tempNode.next;
        tempNode.next = newNode;

    }

    // Remove first element from list
    public int removeFirst() {
        if (size == 0) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = headNode.data;
            headNode = tailNode = null;
            size = 0;
            return val;
        }

        int val = headNode.data;
        headNode = headNode.next;
        size--;
        return val;
    }

    // Remove last element from list
    public int removeLast() {
        if (size == 0) {
            System.out.println("The list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = headNode.data;
            headNode = tailNode = null;
            size = 0;
            return val;
        }

        Node priveouNode = headNode;
        for (int i = 0; i < size - 2; i++) {
            priveouNode = priveouNode.next;
        }

        int val = priveouNode.next.data;
        priveouNode.next = null;
        tailNode = priveouNode;
        size--;
        return val;
    }

    // remove from last -> nth node
    public void remove(int n) {
        // calculate size of the list
        int length = 0;
        Node tempNode = headNode;
        while (tempNode != null) {
            tempNode = tempNode.next;
            length++;
        }

        if (length == n) {
            headNode = headNode.next;
            return;
        }

        int idx = 1;
        int delNode = length - n; // (size - n + 1) this is deleting node
        Node previousNode = headNode;

        while (idx < delNode) {
            previousNode = previousNode.next; // finding the previous node of deleting node from last
            idx++;
        }

        previousNode.next = previousNode.next.next;
        return;
    }

    // search a key and return index
    public int search(int key) {
        if (size == 0 || size == 1) {
            return size;
        }

        Node tempNode = headNode;
        int i = 0;
        while (tempNode != null) {
            if (tempNode.data == key) {
                return i;
            }
            tempNode = tempNode.next;
            i++;
        }

        return -1;
    }

    // Reverse a list
    public void reverse() {

        Node previousNode = null;
        Node currNode = tailNode = headNode;
        Node nextNode;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = previousNode;
            previousNode = currNode;
            currNode = nextNode;
        }

        headNode = previousNode;
    }

    // Checking the list is loop list or not
    public static boolean isCycle() {

        Node slowNode = headNode;
        Node fastNode = headNode;

        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next; // +1
            fastNode = fastNode.next.next;// +2

            if (slowNode == fastNode) {
                return true;
            }
        }

        return false;
    }

    // Removing the cycle from list
    public static void removeCycle() {
        // detect the cycle
        Node slowNode = headNode;
        Node fastNode = headNode;
        boolean cycle = false;

        while (headNode != null && headNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if (slowNode == fastNode) {
                cycle = true; // cycle is exist
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        // find meeting point
        slowNode = headNode;
        Node previousNode = null;

        while (slowNode != fastNode) {
            previousNode = fastNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

        // removing the cycle -> last.next = null (previous node)
        previousNode.next = null;
        return;
    }

    // Slow fast approach to find the list middle node
    public Node findMidNode(Node headNode) {
        Node slowNode = headNode;
        Node fastNode = headNode;

        // finding mid node
        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

    // Cheking the list is palindrom or not
    public boolean isPalindrom() {

        // base case / corner case
        if (headNode == null || headNode.next == null) {
            return true;
        }

        // 1 -> find moddle
        Node midNode = findMidNode(headNode);

        // 2 -> reverse the 2nd half
        Node currNode = midNode;
        Node priveousNode = null;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = priveousNode;
            priveousNode = currNode;
            currNode = nextNode;
        }

        // 3 -> check the list is palindrom or not
        Node rightNode = priveousNode;
        Node leftNode = headNode;

        while (rightNode != null) {
            if (leftNode.data != rightNode.data) {
                return false;
            }

            leftNode = leftNode.next;
            rightNode = rightNode.next;
        }

        return true;

    }

    // printing a list
    public void print() {

        Node tempNode = headNode;
        while (tempNode != null) { // while temp.data == null
            System.out.print(tempNode.data + " --> ");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    /**
     * this code for merge sort on linked list
     * 
     */

    public Node mergeSort(Node headNode) {

        if (headNode == null || headNode.next == null) {
            return headNode;
        }

        Node midNode = getMid(headNode); // get mid
        Node rightHead = midNode.next; // assign right node (Divided into two parts)
        midNode.next = null; // mid node.next = null

        Node newLeft = mergeSort(headNode);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    // merging the right and left node
    private Node merge(Node leftHead, Node rightHead) {

        Node mergedLL = new Node(-1);
        Node tempHead = mergedLL;

        // adding small element into the new ll
        while (leftHead != null && rightHead != null) {
            if (leftHead.data <= rightHead.data) {
                tempHead.next = leftHead;
                leftHead = leftHead.next;
                tempHead = tempHead.next;
            } else {
                tempHead.next = rightHead;
                rightHead = rightHead.next;
                tempHead = tempHead.next;
            }
        }

        // adding the remening element from left ll
        while (leftHead != null) {
            tempHead.next = leftHead;
            leftHead = leftHead.next;
            tempHead = tempHead.next;
        }

        // adding the remening element from right ll
        while (rightHead != null) {
            tempHead.next = rightHead;
            rightHead = rightHead.next;
            tempHead = tempHead.next;
        }

        return mergedLL.next; // return the new ll.next because head data is -1
    }

    // geting the mid for merge sort function
    private Node getMid(Node headNode) {

        Node slowNode = headNode;
        Node fastNode = headNode.next;

        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

    // Zig Zag conversion of ll
    public void zigZag() {

        // Finding mid node
        Node slow = headNode;
        Node fast = headNode.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // reverse thr 2nd ll
        Node currNode = mid.next;
        mid.next = null;
        Node prv = null;
        Node next;

        while (currNode != null) {
            next = currNode.next;
            currNode.next = prv;
            prv = currNode;
            currNode = next;
        }

        // alternate the ll
        Node left = headNode;
        Node right = prv;

        Node newLeft, newRight;

        while (left != null && right != null) {

            newLeft = left.next;
            left.next = right;
            newRight = right.next;
            right.next = newLeft;

            left = newLeft;
            right = newRight;
        }

    }

    public static void main(String[] args) {

        // LinkedList ll = new LinkedList();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // // ll.addLast(1);
        // // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.isPalindrom());

        // headNode = new Node(1);
        // Node tempNode = new Node(2);
        // headNode.next = tempNode;
        // headNode.next.next = new Node(3);
        // headNode.next.next.next = tempNode;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        // My ll is 1 -> 2 -> 3 -> 4 -> 5
        ll.print();
        ll.zigZag();
        ll.print();

    }
}
