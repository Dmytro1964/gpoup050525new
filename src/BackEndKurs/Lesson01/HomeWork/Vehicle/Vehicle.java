package BackEndKurs.Lesson01.HomeWork.Vehicle;

public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;


    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Общий метод для всех транспортных средств
    public void start() {
        System.out.println(brand + " " + model + " заводится...");
    }

    public void stop() {
        System.out.println(brand + " " + model + " останавливается...");
    }

    // Метод для отображения общей информации
    public void displayInfo() {
        System.out.println("Марка: " + brand + ", Модель: " + model + ", Год: " + year);
    }
}

