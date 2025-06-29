package JavaBasic.Lesson24.Homework.TaskManager;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class TaskDemo {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager(10); // ёмкость массива

        while (true) {
            System.out.println("\n1. Добавить задачу\n2. Изменить статус\n3. Показать задачи\n4. Отсортировать\n0. Выход");
            int choice = UserInputStatic.nextInt("Выберите действие: ");

            switch (choice) {
                case 1 -> {
                    Task task = manager.createTaskFromUserInput();
                    manager.addTask(task);
                }
                case 2 -> {
                    int id = UserInputStatic.nextInt("Введите ID задачи: ");
                    String newStatus = UserInputStatic.nextString("Введите новый статус (Open, In Progress, Completed): ");
                    manager.changeStatus(id, newStatus);
                }
                case 3 -> manager.printTasks();
                case 4 -> {
                    manager.sortTasks();
                    System.out.println("Задачи отсортированы по приоритету и названию.");
                }
                case 0 -> {
                    System.out.println("Завершение программы.");
                    return;
                }
                default -> System.out.println("Неверный выбор.");
            }
        }
    }
}


