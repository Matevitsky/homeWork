package HomeWork.Patterns.tetris.figures;

import static HomeWork.Patterns.tetris.figures.UtilPrintMatrix.printMatrix;

public class I extends Figure {


    @Override
    public void print() {
        int[][] matrix =
            {{0, 1, 0},
                {0, 1, 0},
                {0, 1, 0}};

        printMatrix(matrix);
    }

}
