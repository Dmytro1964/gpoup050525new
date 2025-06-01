package Lesson14.Homework.Task1;

import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int product = 1;
        boolean hasEven = false; // проверим, были ли чётные числа

        System.out.println("Введите чётные числа для перемножения. Введите 0 для завершения:");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break; // завершение ввода
            }

            if (number % 2 == 0) {
                product *= number;
                hasEven = true;
            } else {
                System.out.println("Число нечетное и не будет учтено.");
            }
        }

        if (hasEven) {
            System.out.println("Результат умножения всех чётных чисел: " + product);
        } else {
            System.out.println("Вы не ввели ни одного чётного числа.");
        }
    }
}
