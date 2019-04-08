package HomeWork.Patterns.tetris.figures;

public class SuperT extends Figure {
    @Override
    public void print() {
        int[][] matrix =
            {{0, 1, 0},
                {0, 1, 0},
                {1, 1, 1}};

        UtilPrintMatrix.printMatrix(matrix);
    }

}
