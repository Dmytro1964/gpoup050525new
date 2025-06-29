package JavaBasic.Lesson11.Homework.Exercise03;

public class TaskDemo {
    public static void main(String[] args) {
        Task task1 = new Task("Позвонить другу", " Договориться о рыбалке.");
        Task task2 = new Task("Учить Java", "Решать задачи.");
        Task task3 = new Task("Сходить в магазин", "Купить хлеб и молоко.");

        DayTask day1 = new DayTask(1, task1);
        DayTask day2 = new DayTask(2, task2);
        DayTask day3 = new DayTask(3, task3);

        System.out.println("Список задач на сегодня:\n");
        day1.printDayTask();
        day2.printDayTask();
        day3.printDayTask();
    }
    }

