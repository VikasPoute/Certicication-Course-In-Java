package BackTracking;

/**
 * ArrayOp
 */
public class ArrayOp {

    public static void changeArr(int arr[], int i, int val) {
        // Base case
        if (i == arr.length) {
            printArr(arr); // print arr op -> 1 2 3 4 5
            return;
        }

        arr[i] = val; // store value in first idx
        changeArr(arr, i + 1, val + 1); // Recursion call
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}