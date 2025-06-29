package JavaBasic.Lesson24.Homework.TaskManager;

public class Task {
    private int id;
    private String taskTitle;
    private String taskDescription;
    private String priority;  // "High", "Medium", "Low"
    private String status;    // "Open", "In Progress", "Completed"

    public Task(int id, String taskTitle, String taskDescription, String priority, String status) {
        this.id = id;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.priority = priority;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getPriority() {
        return priority;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Название: " + taskTitle +
                "\nОписание: " + taskDescription +
                "\nПриоритет: " + priority + " | Статус: " + status + "\n";
    }
}

