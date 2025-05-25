package Lesson08.Homework;

import java.util.Scanner;

public class PhoneDemo {
    public static void main(String[] args) {


        // 1. Создание объекта
        Phone phone1 = new Phone("Nokia 70A", "grey", false);

        // 2. Вывод текущего состояния телефона
        System.out.println(phone1);

        // 3. Ввод нового значения режима "без звука"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Включить режим без звука? (true/false): ");
        boolean changeStatus = scanner.nextBoolean();

        // 4. Изменение состояния
        phone1.setSilent(changeStatus);

        // 5. Повторный вывод состояния
        System.out.println("Статус телефона после изменения режима звука:");
        System.out.println(phone1);

        // 6. Закрываем сканер
        scanner.close();
    }
}
