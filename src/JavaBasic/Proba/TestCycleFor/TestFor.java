package JavaBasic.Proba.TestCycleFor;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class TestFor {
    public static void main(String[] args) {

        int n = UserInputStatic.nextInt("Введите число N: ");

        int count = 0; // переменная-счётчик

        // Цикл от 1 до n включительно
        for (int i = 1; i <= n; i++) {
            // Если число делится на 3 и НЕ делится на 5
            if (i % 3 == 0 && i % 5 != 0) {
                count++; // увеличиваем счётчик
            }
        }

        // Выводим результат
        System.out.println("Количество чисел: " + count);
    }
}
