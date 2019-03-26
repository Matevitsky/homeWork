package HomeWork.Lesson3HomeWork.repository;

import HomeWork.Lesson3HomeWork.entity.Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    private Car[] cars;

    public CarRepository(Car[] cars) {
        this.cars = cars;
    }

    //список автомобилей заданной марки;
    public Car[] findByBrandName(String carBrand) {
        List<Car> resultList = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getCarBrand().name().equals(carBrand)) {
                resultList.add(cars[i]);
            }
        }
        if (resultList.isEmpty()) {
            return null;
        } else {

            return resultList.toArray(new Car[resultList.size()]);
        }
    }

    // список автомобилей заданной модели, которые эксплуатируются боль-ше n лет;
    public Car[] findByBrandAndYear(String carModel, int yearNubmer) {

        List<Car> resultList = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getModel().equals(carModel) && (currentYear - cars[i].getYear() > yearNubmer)) {
                resultList.add(cars[i]);
            }
        }
        if (resultList.isEmpty()) {
            return null;
        } else {

            return resultList.toArray(new Car[resultList.size()]);
        }
    }

    //список автомобилей заданного года выпуска, цена которых больше ука-занной.
    public Car[] findByYearAndPrice(int dateOfFirstRegistration, int price) {

        List<Car> resultList = new ArrayList<>();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYear() == dateOfFirstRegistration && cars[i].getPrice() > price) {
                resultList.add(cars[i]);
            }
        }
        if (resultList.isEmpty()) {
            return null;
        } else {

            return resultList.toArray(new Car[resultList.size()]);
        }
    }
}
