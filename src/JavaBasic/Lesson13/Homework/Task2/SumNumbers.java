package JavaBasic.Lesson13.Homework.Task2;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Запрос числа у пользователя
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Подсчёт суммы чётных чисел от 0 до N
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        // Вывод результата
        System.out.println("Сумма всех чётных чисел от 0 до " + n + " равна: " + sum);
    }
}
