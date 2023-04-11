package Questions.Recurssion;

public class FindAllOccrance {
    public static void printOccrance(int arr[], int key, int idx) {
        if (idx == arr.length) {
            return;
        }

        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }

        printOccrance(arr, key, idx + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        printOccrance(arr, 2, 0);
    }
}
