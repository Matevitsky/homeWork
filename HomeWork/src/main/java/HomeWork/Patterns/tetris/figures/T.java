package HomeWork.Patterns.tetris.figures;

public class T extends Figure {
    @Override
    public void print() {
        int[][] matrix =
            {{0, 1, 0},
                {1, 1, 1},
                {0, 0, 0}};

        UtilPrintMatrix.printMatrix(matrix);
    }

}
