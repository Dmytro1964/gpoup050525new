package JavaBasic.Lesson15.HomeWork.Task1;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[8];

        // Заполнение массива случайными числами от 1 до 50
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50) + 1; // [0,49] + 1 = [1,50]
        }

        // Вывод исходного массива
        System.out.print("Исходный массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Замена элементов с нечетным индексом на 0
        for (int i = 1; i < numbers.length; i += 2) {
            numbers[i] = 0;
        }

        // Вывод изменённого массива
        System.out.print("\nИзменённый массив: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
