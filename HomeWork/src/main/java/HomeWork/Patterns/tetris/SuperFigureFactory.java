package HomeWork.Patterns.tetris;

import HomeWork.Patterns.tetris.figures.*;

import java.util.Random;

public class SuperFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {

        int randomNumber = new Random().nextInt(8) + 1;
        Figure figure;
        switch (randomNumber) {
            case (1):
                figure = new SuperI();
                break;
            case (2):
                figure = new SuperJ();
                break;
            case (3):
                figure = new SuperL();
                break;
            case (4):
                figure = new SuperLD();
                break;
            case (5):
                figure = new SuperO();
                break;
            case (6):
                figure = new SuperS();
                break;
            case (7):
                figure = new SuperT();
                break;
            case (8):
                figure = new SuperZ();
                break;
            default:
                figure = null;
        }
        return figure;
    }
}
