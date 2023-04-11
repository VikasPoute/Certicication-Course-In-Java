package BackTracking;

/**
 * NQueenProb
 */
public class NQueenProb {

    public static boolean isSafe(char arr[][], int row, int col) {
        // for vertical up

        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }

        // for diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        // for diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char[][] arr, int row) {

        // base case
        if (row == arr.length) {
            printAns(arr); // To print possible ways
            count++; // To count the no of ways
            return;
        }

        for (int j = 0; j < arr.length; j++) {
            if (isSafe(arr, row, j)) {
                arr[row][j] = 'Q';
                nQueens(arr, row + 1);
                arr[row][j] = 'X';
            }
        }
    }

    // printing ans array
    public static void printAns(char[][] arr) {
        System.out.println("-----Chess Board-----");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    public static void main(String[] args) {

        int n = 20;
        char arr[][] = new char[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 'X';
            }
        }

        nQueens(arr, 0);
        System.out.println("The total no of ways to place queens: " + count + " ways");
    }

}