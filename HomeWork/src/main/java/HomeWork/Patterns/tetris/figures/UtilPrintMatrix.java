package HomeWork.Patterns.tetris.figures;

public class UtilPrintMatrix {
    static void printMatrix(int[][] matrix) {
        for (int[] aMatrix : matrix) {
            for (int j = 0; j < aMatrix.length; j++) {

                System.out.print(aMatrix[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }

    }
}
