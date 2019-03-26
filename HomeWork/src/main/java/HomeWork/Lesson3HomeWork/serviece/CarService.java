package HomeWork.Lesson3HomeWork.serviece;

import HomeWork.Lesson3HomeWork.entity.Car;
import HomeWork.Lesson3HomeWork.repository.CarRepository;

public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car[] findByBrandName(String carBrand) {
        return carRepository.findByBrandName(carBrand);
    }

    // список автомобилей заданной модели, которые эксплуатируются боль-ше n лет;
    public Car[] carsByModelAndYear(String carModel, int yearNubmer) {
        return carRepository.findByBrandAndYear(carModel, yearNubmer);
    }

    //список автомобилей заданного года выпуска, цена которых больше ука-занной.
    public Car[] findByYearWithPrice(int dateOfFirstRegistration, int price) {
        return carRepository.findByYearAndPrice(dateOfFirstRegistration, price);
    }
}
