package Lesson12.Homework.Exercise1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        // Создаем сканер для ввода
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число (1, 2 или 3): ");
        // Считываем введенное число

        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Вы ввели неизвестное число");

        }

    }
}