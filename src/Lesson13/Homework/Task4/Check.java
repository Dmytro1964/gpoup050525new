package Lesson13.Homework.Task4;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Число не является простым.");
            return;
        }

        boolean isPrime = true;

        // Проверка делителей от 2 до sqrt(number)
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break; // если делится на что-то кроме 1 и самого себя
            }
        }

        if (isPrime) {
            System.out.println("Число простое.");
        } else {
            System.out.println("Число не является простым.");
        }

    }
}
