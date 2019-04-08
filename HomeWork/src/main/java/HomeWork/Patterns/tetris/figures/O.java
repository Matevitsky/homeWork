package HomeWork.Patterns.tetris.figures;

import static HomeWork.Patterns.tetris.figures.UtilPrintMatrix.printMatrix;

public class O extends Figure {
    @Override
    public void print() {
        int[][] matrix =
            {{1, 1, 0},
                {1, 1, 0},
                {0, 0, 0}};

        printMatrix(matrix);
    }

}
