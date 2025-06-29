package JavaBasic.Lesson11.Homework.Exercise02;

public class Task {

    private String title;
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void printTask() {
        System.out.println("Задача: " + title);
        System.out.println("Описание: " + description);}

}
