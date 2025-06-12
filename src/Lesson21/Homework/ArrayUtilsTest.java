package Lesson21.Homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ArrayUtilsTest {

    @Test
    void getEvenNumbers() {

        // Входной массив
        int[] input = {1, 2, 3, 4, 5, 6};

        // Ожидаемый результат
        int[] expected = {2, 4, 6};

        // Вызов метода и сохранение результата
        int[] actual = ArrayUtils.getEvenNumbers(input);

        // Сравнение массивов
        assertArrayEquals(expected, actual);
    }
}

