package JavaBasic.Lesson17.Homework;

import java.util.Scanner;

public class UserInputStatic {
    public static Scanner scanner = new Scanner(System.in);

    // Ввод строки
    public static String nextString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Ввод целого числа (в одной строке с сообщением)
    public static int nextIntInline(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // очищаем перевод строки
        return value;
    }

    // Ввод целого числа (сообщение на одной строке, ввод — на следующей)
    public static int nextInt(String message) {
        System.out.println(message); // новая строка
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // очищаем перевод строки
        return value;
    }

    // Ввод числа с плавающей точкой
    public static double nextDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Ошибка! Введите число (например: 12.5): ");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    // Ввод логического значения
    public static boolean nextBoolean(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextBoolean()) {
            System.out.print("Ошибка! Введите true или false: ");
            scanner.next();
        }
        boolean value = scanner.nextBoolean();
        scanner.nextLine();
        return value;
    }

    // Закрытие сканера
    public static void closeScanner() {
        scanner.close();
    }

}

