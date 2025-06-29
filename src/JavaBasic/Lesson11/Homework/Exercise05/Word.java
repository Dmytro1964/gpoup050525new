package JavaBasic.Lesson11.Homework.Exercise05;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ввод двух слов
        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();

        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();

        // Вычисление половины первого слова
        int half1 = word1.length() / 2;

        // Вычисление половины второго слова
        int half2 = word2.length() / 2;

        // Первая половина первого слова
        String part1 = word1.substring(0, half1);

        // Вторая половина второго слова (учитываем нечётность)
        String part2 = word2.length() % 2 == 0
                ? word2.substring(half2)
                : word2.substring(half2 + 1);

        // Объединение двух частей
        String result = part1 + part2;

        System.out.println("Результат: " + result);
    }
}
