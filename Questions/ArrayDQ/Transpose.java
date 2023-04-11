package Questions.ArrayDQ;

public class Transpose {
    public static void matrixTranspose(int matrix[][]) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int matrix[][] = {
                { 11, 12, 13 },
                { 21, 22, 23 }
        };

        matrixTranspose(matrix);
    }
}
