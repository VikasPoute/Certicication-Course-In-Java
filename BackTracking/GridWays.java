package BackTracking;

/**
 * GridWays
 */
public class GridWays {

    public static int countGridWays(int i, int j, int n, int m) {

        // base cases
        if (i == n - 1 && j == m - 1) { 
            return 1;
        } else if (i == n || j == m) { // Boundry case 
            return 0;
        }

        return countGridWays(i + 1, j, n, m) + countGridWays(i, j + 1, n, m);
    }

    public static void main(String[] args) {

        int n = 3, m = 3;
        System.out.println(countGridWays(0, 0, n, m));
    }
}