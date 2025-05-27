package Lesson11.Homework.Exercise03;

public class DayTask {

    private int number;
    private Task task;

    public DayTask(int number, Task task) {
        this.number = number;
        this.task = task;
    }

    public void printDayTask() {
        System.out.println("Задача №" + number);
        System.out.println("Наименование: " + task.getTitle());
        System.out.println("Описание: " + task.getDescription());

    }
}
