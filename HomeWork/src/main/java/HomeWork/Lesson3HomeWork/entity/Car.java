package HomeWork.Lesson3HomeWork.entity;


public class Car {

    private final Long id;
    private final CarBrand carBrand;

    private String model;


    private final int year;

    private final Color Color;

    private Integer Price;

    private final String licenseNumber;

    public Car(Long id, CarBrand carBrand, String model, int year, Color color, Integer price, String licenseNumber) {
        this.id = id;
        this.model = model;
        this.carBrand = carBrand;
        this.year = year;
        Color = color;
        Price = price;
        this.licenseNumber = licenseNumber;
    }

    public Long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public int getYear() {
        return year;
    }

    public HomeWork.Lesson3HomeWork.entity.Color getColor() {
        return Color;
    }

    public Integer getPrice() {
        return Price;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carBrand=" + carBrand +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", Color=" + Color +
                ", Price=" + Price +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }
}