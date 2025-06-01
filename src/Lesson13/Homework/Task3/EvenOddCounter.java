package Lesson13.Homework.Task3;

import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод числа N
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        // Подсчёт чётных и нечётных чисел
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Вывод результата
        System.out.println("Количество чётных чисел: " + evenCount);
        System.out.println("Количество нечётных чисел: " + oddCount);
    }
}
