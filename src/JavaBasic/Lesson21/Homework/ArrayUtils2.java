package JavaBasic.Lesson21.Homework;

public class ArrayUtils2 {

    public static double average(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0; // обработка пустого или null-массива
        }

        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }
}

