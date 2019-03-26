package HomeWork.Lesson3HomeWork.ui;

import HomeWork.Lesson3HomeWork.entity.Car;
import HomeWork.Lesson3HomeWork.serviece.CarService;

import java.util.Scanner;

public class ConsoleUI {

    private CarService carService;

    private Scanner scanner;

    public ConsoleUI(CarService carService) {
        this.carService = carService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean isSelected = false;
        int operationNumber = 0;

        while (!isSelected) {
            System.out.println("Пожалуйста выберите операцию");
            System.out.println("1 - список автомобилей заданной марки;");
            System.out.println("2 - список автомобилей заданной модели, которые эксплуатируются больше n лет");
            System.out.println("3 - список автомобилей заданного года выпуска, цена которых больше указанной");

            operationNumber = scanner.nextInt();

            if (operationNumber > 0 && operationNumber < 4) {
                isSelected = true;
            }

        }
        switch (operationNumber) {
            case 1:
                carsByBrand();
                break;
            case 2:
                carsByModelAndYear();
                break;
            case 3:
                carsByYearAndPrice();
                break;
        }

        System.out.println("\nWish to continue?");
        System.out.println("YES / NO");
        if (scanner.next().equalsIgnoreCase("YES")) run();
        System.out.println("Bye!");
        scanner.close();

    }

    private void carsByModelAndYear() {
        System.out.println("Выберите модель авто");
        String carModel = scanner.next();
        System.out.println("Введите год выпуска");
        int year = scanner.nextInt();

        try {
            if ((carService.carsByModelAndYear(carModel, year) != null)) {
                print(carService.carsByModelAndYear(carModel, year));
            } else {
                System.out.println("Не существует авто с заданными критериями");
            }

        } catch (IllegalArgumentException a) {
            System.out.println("Такой марки авто не существует, попробуйте еще раз");
            carsByModelAndYear();
        }

    }

    private void carsByBrand() {
        System.out.println("Выберите марку авто");
        String carBrand = scanner.next();
        try {
            if (carService.findByBrandName(carBrand) != null) {
                print(carService.findByBrandName(carBrand));
            } else {
                System.out.println("Не существует авто с заданными критериями");
            }

        } catch (IllegalArgumentException a) {
            System.out.println("Такой марки авто не существует, попробуйте еще раз");
            carsByBrand();
        }

    }

    private void carsByYearAndPrice() {
        System.out.println("Ведите год выпуска");
        int year = scanner.nextInt();
        System.out.println("Введите цену");
        int price = scanner.nextInt();

        if (carService.findByYearWithPrice(year, price) != null) {
            print(carService.findByYearWithPrice(year, price));
        } else {
            System.out.println("Не существует авто с заданными критериями");
        }

    }

    private void print(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
