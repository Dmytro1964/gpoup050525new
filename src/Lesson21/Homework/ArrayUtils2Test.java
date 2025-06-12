package Lesson21.Homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtils2Test {

    @Test
    void average() {

        // Вычисляем среднее как double
        double result = ArrayUtils2.average(new int[]{1, 2, 3, 4, 5});

        // Приводим результат к int (отбрасываем дробную часть)
        int intResult = (int) result;

        // Сравниваем с ожидаемым целым числом
        assertEquals(3, intResult);
    }
}
