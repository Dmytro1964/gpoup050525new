package Lesson22;

public class CarCatalogService {

    private Car[] cars;        // массив для хранения автомобилей
    private int size = 0;      // текущий счетчик добавленных машин

    public CarCatalogService(int capacity) {
        cars = new Car[capacity];   // создаем массив фиксированного размера
    }

    // Добавление нового автомобиля
    public boolean addCar(Car car) {
        if (size >= cars.length) {
            return false; // массив заполнен, добавить нельзя
        }
        cars[size] = car;
        size++;
        return true;
    }

    // Поиск по номеру
    public Car findByNumber(String number) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getNumber().equals(number)) {
                return cars[i];
            }
        }
        return null;
    }

    // Поиск по марке
    public Car[] findByBrand(String brand) {
        // Сначала посчитаем, сколько автомобилей подходит
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getBrand().equalsIgnoreCase(brand)) {
                count++;
            }
        }

        // Создаем новый массив нужного размера
        Car[] result = new Car[count];
        int idx = 0;
        for (int i = 0; i < size; i++) {
            if (cars[i].getBrand().equalsIgnoreCase(brand)) {
                result[idx] = cars[i];
                idx++;
            }
        }
        return result;
    }

    // Поиск по ценовому диапазону
    public Car[] findByPriceRange(double minPrice, double maxPrice) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            double price = cars[i].getPrice();
            if (price >= minPrice && price <= maxPrice) {
                count++;
            }
        }

        Car[] result = new Car[count];
        int idx = 0;
        for (int i = 0; i < size; i++) {
            double price = cars[i].getPrice();
            if (price >= minPrice && price <= maxPrice) {
                result[idx] = cars[i];
                idx++;
            }
        }
        return result;
    }
}
