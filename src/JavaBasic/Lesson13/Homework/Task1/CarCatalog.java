package JavaBasic.Lesson13.Homework.Task1;

import java.util.Scanner;

public class CarCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Спросим, сколько машин нужно ввести
        System.out.print("Сколько автомобилей вы хотите добавить в каталог? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // очистка строки после числа

        // Создаём массив для машин
        Car[] cars = new Car[count];

        // Ввод данных от пользователя
        for (int i = 0; i < count; i++) {
            System.out.println("\nВведите данные для автомобиля #" + (i + 1));

            System.out.print("Производитель: ");
            String producer = scanner.nextLine();

            System.out.print("Модель: ");
            String model = scanner.nextLine();

            System.out.print("Мощность (л.с.): ");
            int power = scanner.nextInt();
            scanner.nextLine(); // очистка строки

            // Создаём объект и добавляем в массив
            cars[i] = new Car(producer, model, power);
        }

        // Вывод каталога автомобилей
        System.out.println("\nКаталог автомобилей:");
        for (Car car : cars) {
            car.printCarInfo();
        }

    }
}
