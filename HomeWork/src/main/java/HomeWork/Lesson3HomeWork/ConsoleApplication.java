package HomeWork.Lesson3HomeWork;

import HomeWork.Lesson3HomeWork.entity.Car;
import HomeWork.Lesson3HomeWork.entity.CarBrand;
import HomeWork.Lesson3HomeWork.entity.Color;
import HomeWork.Lesson3HomeWork.repository.CarRepository;
import HomeWork.Lesson3HomeWork.serviece.CarService;
import HomeWork.Lesson3HomeWork.ui.ConsoleUI;

public class ConsoleApplication {

    public static void main(String[] args) {

        Car car1 = new Car(1L, CarBrand.BMW, "X5", 2001, Color.BlACK, 3000, "AA5566BB");
        Car car2 = new Car(2L, CarBrand.FERRARI, "Ferrari", 2001, Color.GREEN, 4000, "AA9922BB");
        Car car3 = new Car(3L, CarBrand.FORD, "Fiesta", 2002, Color.BLUE, 5000, "AA7788BB");
        Car car4 = new Car(4L, CarBrand.OPEL, "Astra", 2003, Color.RED, 1000, "AA7735BB");
        Car car5 = new Car(5L, CarBrand.BMW, "X7", 2001, Color.BlACK, 3000, "AA7135BB");


        Car[] cars = new Car[5];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;


        CarRepository carRepository = new CarRepository(cars);
        CarService carService = new CarService(carRepository);
        ConsoleUI consoleUI = new ConsoleUI(carService);
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
        consoleUI.run();
    }
}
