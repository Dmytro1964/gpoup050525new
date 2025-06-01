package Lesson15.HomeWork.Task2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[5];

        // Заполнение массива случайными числами от 10 до 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(90) + 10; // [0,89] + 10 = [10,99]
        }

        // Вывод массива
        System.out.print("Массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Проверка на строго возрастающую последовательность
        boolean isIncreasing = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        // Вывод результата
        if (isIncreasing) {
            System.out.println(" Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println(" Массив НЕ является строго возрастающей последовательностью.");
        }
    }
}
