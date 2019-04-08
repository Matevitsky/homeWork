package HomeWork.Patterns.tetris;

public class ConsoleApp {
    public static void main(String[] args) {
        FigureFactory figureFactory = new RandomFigureFactory();

        while (true) {
            figureFactory.createFigure().print();
        }
    }
}
