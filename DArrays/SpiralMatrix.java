package DArrays;

public class SpiralMatrix {

    public static void printSpiralMatrix(int matrix[][]) {

        int stRow = 0;
        int stCol = 0;
        int edRow = matrix.length - 1;
        int edCol = matrix[0].length - 1;

        while (stRow <= edRow && stCol <= edCol) {

            // top
            for (int col = stCol; col <= edCol; col++) {
                System.out.print(matrix[stRow][col] + " ");
            }

            // right
            for (int row = stRow + 1; row <= edRow; row++) {
                System.out.print(matrix[row][edCol] + " ");
            }

            // bottom
            for (int col = edCol - 1; col >= stCol; col--) {
                if (stRow == edRow) {
                    break;
                }
                System.out.print(matrix[edRow][col] + " ");
            }

            // left
            for (int row = edRow - 1; row >= stRow + 1; row--) {
                if (stCol == edCol) {
                    break;
                }
                System.out.print(matrix[row][stCol] + " ");
            }

            stRow++;
            stCol++;
            edRow--;
            edCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiralMatrix(matrix);
    }
}
