package JavaBasic.Lesson22;

public class Car {

   /* Написать приложение для каталога на выставке.
    Каталог автомобилей.

    Необходимо реализовать следующий функционал:

            1. Хранение автомобилей заранее определенного количества.
2. Добавление нового автомобиля.
3. Поиск автомобиля по номеру в каталоге
4. Поиск автомобилей по марке
5. Поиск автомобилей по ценовому диапазону (не дешевле чем ... и не дороже чем ...)

    И написать тесты для проверки работы сервисных методов.

    */
   private String number;  // Номер автомобиля, уникальный идентификатор
    private String brand;   // Марка автомобиля
    private double price;   // Цена автомобиля

    public Car(String number, String brand, double price) {
        this.number = number;
        this.brand = brand;
        this.price = price;
    }

    // Геттеры
    public String getNumber() {
        return number;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    // Чтобы удобнее было смотреть в тестах и отладке
    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

