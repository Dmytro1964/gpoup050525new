package JavaBasic.Test.Test06;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class CarCatalog {
    public static void main(String[] args) {

        int count = UserInputStatic.nextInt(" Сколько автомобилей добавить ?");
        Car[] cars = new Car[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Введите данные для автомобиля N" + (i + 1));

            // 3.1. Запрашиваем у пользователя каждое поле
            String producer = UserInputStatic.nextString("Производитель: ");
            String model = UserInputStatic.nextString("Модель: ");
            int power = UserInputStatic.nextInt("Мощность (в л.с.): ");

            cars[i] = new Car(producer, model, power);


        }
        // 4. Выводим все машины
        System.out.println("\nКаталог автомобилей:");
        for (int i = 0; i < cars.length; i++) {
            cars[i].printCarInfo();
        }
    }
}