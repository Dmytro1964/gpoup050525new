package JavaBasic.Lesson23.Homework.Task1;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class ArrayService {public int[] createArrayFromUserInput() {
    int size = UserInputStatic.nextInt("Введите число:");
    return new int[size];
}

    public int[] fillArrayFromUserInput(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = UserInputStatic.nextInt("Вводите следующий номер " + (i + 1) + ":");
        }
        return array; // ← вот этой строки не хватало
    }
}







