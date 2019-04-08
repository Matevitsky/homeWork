package HomeWork.Patterns.tetris;

import HomeWork.Patterns.tetris.figures.*;

import java.util.Random;

public class RandomFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        int randomNumber = new Random().nextInt(9) + 1;
        Figure figure;
        switch (randomNumber) {
            case (1):
                figure = new I();
                break;
            case (2):
                figure = new J();
                break;
            case (3):
                figure = new L();
                break;
            case (4):
                figure = new LD();
                break;
            case (5):
                figure = new O();
                break;
            case (6):
                figure = new S();
                break;
            case (7):
                figure = new T();
                break;
            case (8):
                figure = new Z();
                break;
            default:
                figure = new SuperFigureFactory().createFigure();
        }
        return figure;
    }
}
