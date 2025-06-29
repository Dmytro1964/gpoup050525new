package JavaBasic.Lesson21.Homework;

public class ArrayUtils {
    public static int[] getEvenNumbers(int[] input) {
        int count = 0;
        for (int number : input) {
            if (number % 2 == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int number : input) {
            if (number % 2 == 0) {
                result[index++] = number;
            }
        }

        return result;
    }
}

