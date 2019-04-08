package HomeWork.Patterns.tetris.figures;

public class SuperS extends Figure {
    @Override
    public void print() {
        int[][] matrix =
            {{0, 0, 1, 1, 1},
                {0, 0, 1, 0, 0},
                {1, 1, 1, 0, 0}};

        UtilPrintMatrix.printMatrix(matrix);
    }
}
