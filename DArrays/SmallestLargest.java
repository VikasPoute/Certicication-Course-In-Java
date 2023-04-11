package DArrays;

import java.util.Scanner;

public class SmallestLargest {

    private static Scanner sc = new Scanner(System.in);

    public static void findBiggestSmallest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                smallest = Integer.min(smallest, matrix[i][j]);
                largest = Integer.max(largest, matrix[i][j]);
            }
        }

        System.out.println("The largest element in matrix is: " + largest);
        System.out.println("The smallest element in matrix is: " + smallest);
    }

    public static void main(String[] args) {
        int row = sc.nextInt();
        int cols = sc.nextInt();

        int matrix[][] = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The output is: ");
        findBiggestSmallest(matrix);
    }
}
