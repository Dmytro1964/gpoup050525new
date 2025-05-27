package Lesson11.Homework.Exercise02;

public class TaskDemo {
    public static void main(String[] args) {

        Task task1 = new Task("Позвонить другу", " Договориться о рыбалке.");
        Task task2 = new Task("Сделать домашнее задание", "Закончить задачи по Java.");
        Task task3 = new Task("Купить продукты", "Молоко, хлеб, яйца.");

        System.out.println("Список дел на сегодня:");

        task1.printTask();
        task2.printTask();
        task3.printTask();
    }
    }

