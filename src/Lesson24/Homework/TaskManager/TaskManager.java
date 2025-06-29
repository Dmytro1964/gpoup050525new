package Lesson24.Homework.TaskManager;

import Lesson17.Homework.UserInputStatic;

public class TaskManager {    private Task[] tasks;
    private int nextId = 1;

    public TaskManager(int capacity) {
        tasks = new Task[capacity];
    }

    public Task createTaskFromUserInput() {
        System.out.println("Создание новой задачи:");
        String title = UserInputStatic.nextString("Введите название задачи: ");
        String description = UserInputStatic.nextString("Введите описание задачи: ");
        String priority = UserInputStatic.nextString("Приоритет (High, Medium, Low): ");
        String status = "Open";

        Task task = new Task(nextId, title, description, priority, status);
        nextId++;
        return task;
    }

    public void addTask(Task task) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = task;
                System.out.println("Задача добавлена с ID " + task.getId());
                return;
            }
        }
        System.out.println("Массив задач заполнен. Добавление невозможно.");
    }

    public void changeStatus(int id, String newStatus) {
        for (Task task : tasks) {
            if (task != null && task.getId() == id) {
                task.setStatus(newStatus);
                System.out.println("Статус задачи ID " + id + " изменён на " + newStatus);
                return;
            }
        }
        System.out.println("Задача с таким ID не найдена.");
    }

    public void printTasks() {
        System.out.println("\nСписок задач:");
        for (Task task : tasks) {
            if (task != null) {
                System.out.println(task);
            }
        }
    }

    public void sortTasks() {
        for (int i = 0; i < tasks.length - 1; i++) {
            for (int j = i + 1; j < tasks.length; j++) {
                if (tasks[i] == null || tasks[j] == null) continue;

                int p1 = getPriorityValue(tasks[i].getPriority());
                int p2 = getPriorityValue(tasks[j].getPriority());

                // Сортируем сначала по приоритету, затем по названию задачи
                if (p1 > p2 || (p1 == p2 &&
                        tasks[i].getTaskTitle().compareToIgnoreCase(tasks[j].getTaskTitle()) > 0)) {
                    Task temp = tasks[i];
                    tasks[i] = tasks[j];
                    tasks[j] = temp;
                }
            }
        }
    }

    private int getPriorityValue(String priority) {
        if (priority == null) return Integer.MAX_VALUE;
        switch (priority.toLowerCase()) {
            case "high":
                return 1;
            case "medium":
                return 2;
            case "low":
                return 3;
            default:
                return Integer.MAX_VALUE; // неизвестный приоритет
        }
    }
}