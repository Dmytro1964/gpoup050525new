package Lesson12.Homework.Task1;

import java.util.Scanner;

public class NumberChoiceSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число (1, 2 или 3): ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Вы выбрали число 1");
                break;
            case 2:
                System.out.println("Вы выбрали число 2");
                break;
            case 3:
                System.out.println("Вы выбрали число 3");
                break;
            default:
                System.out.println("Вы ввели число, которое не является 1, 2 или 3");
        }

        scanner.close();
    }
}


