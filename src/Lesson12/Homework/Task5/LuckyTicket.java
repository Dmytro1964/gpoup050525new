package Lesson12.Homework.Task5;

import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите четырёхзначное число: ");
        String input = scanner.nextLine();

        // Проверка, состоит ли строка из 4 символов и все ли это цифры
        if (input.length() != 4 || !input.matches("\\d{4}")) {
            System.out.println("Ошибка: нужно ввести строго четырёхзначное число!");
            return; // завершение программы
        }

        // Извлекаем цифры
        int firstDigit = Character.getNumericValue(input.charAt(0));
        int secondDigit = Character.getNumericValue(input.charAt(1));
        int thirdDigit = Character.getNumericValue(input.charAt(2));
        int fourthDigit = Character.getNumericValue(input.charAt(3));

        int sumFirstTwo = firstDigit + secondDigit;
        int sumLastTwo = thirdDigit + fourthDigit;

        // Сравнение и вывод результата
        if (sumFirstTwo == sumLastTwo) {
            System.out.println("Поздравляем! У вас счастливый билет!");
        } else {
            System.out.println("Увы, это обычный билет.");}

    }

}
