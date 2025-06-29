package Lesson24.Homework.ArrayService;

import Lesson17.Homework.UserInputStatic;

public class ArrayService {
    // Метод: создаёи массив нужной длины (ввод от пользователя)
    public int[] createArrayFromUserInput() {
        int length = UserInputStatic.nextInt("Введите размер массива: ");
        return new int[length];
    }

    // Метод: заполняем массив значениями от пользователя
    public int[] fillArrayFromUserInput(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = UserInputStatic.nextInt("Введите элемент №" + (i + 1) + ": ");
        }
        return array;
    }

    // Метод: сортируем массив по убыванию
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Метод: печатаем массив
    public void printArray(int[] array) {
        System.out.print("Отсортированный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // переходим на новую строку
    }
}

