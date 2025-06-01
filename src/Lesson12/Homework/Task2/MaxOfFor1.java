package Lesson12.Homework.Task2;

public class MaxOfFor1 {
    public static void main(String[] args) {
        // Задаём массив чисел
        int[]number = {1,2,3,4};
        // Начинаем с первого числа в массиве
        int max = number[0];
        // Перебираем остальные элементы массива
        for (int i=1; i < number.length; i++){
            if (number[i] > max){
                max = number[i];
            }
        }
        // Выводим результат
        System.out.println( "Максимальное число : " + max);



    }
}
