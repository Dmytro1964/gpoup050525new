package Lesson16.Homework;

public class GroupDemoA {

    public static void main(String[] args) {
        Student student1 = new Student("Алена", "Group1");
        Student student2 = new Student("Виктор", "Group1");
        Student student3 = new Student("Александр", "Group1");

        // Массив студентов
        Student[] group1Students = {student1, student2, student3};

        // Создание группы
        Group group1 = new Group("Group1", group1Students);

        // Вывод
        System.out.println(group1);
    }
}
