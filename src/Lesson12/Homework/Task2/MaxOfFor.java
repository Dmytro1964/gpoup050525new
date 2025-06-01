package Lesson12.Homework.Task2;

import java.util.Random;

public class MaxOfFor {
    public static void main(String[] args) {
        Random random = new Random();
        // 1. Случайные числа от 0 до 100
        int A = random.nextInt(101);
        int B = random.nextInt(101);
        int C = random.nextInt(101);
        int D = random.nextInt(101);
        // 2. Выводим числа
       System.out.println(" Числа  : " + A + "," + B + "," + C + "," + D);
        // 3. Поиск максимального числа
        int max = A;

        if (B > max) max = B;
        if (C > max) max = C;
        if (D > max) max = D;
        // 4. Вывод максимального
        System.out.println( " Максимальное число : " + max);






    }
}
