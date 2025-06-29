package Lesson24.Homework.ArrayService;

public class ArraySortDemo {
    public static void main(String[] args) {

        ArrayService service = new ArrayService();

        // Создание массива
        int[] array = service.createArrayFromUserInput();

        // Заполнение массива значениями
        service.fillArrayFromUserInput(array);

        // Сортировка по убыванию
        service.sort(array);

        // Печать результата
        service.printArray(array);
    }
}


