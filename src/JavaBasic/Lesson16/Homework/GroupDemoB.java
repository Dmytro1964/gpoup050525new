package JavaBasic.Lesson16.Homework;

public class GroupDemoB {
    public static void main(String[] args) {
        // Создание группы с пустым массивом на 2 студента
        Group group2 = new Group("Group2", new Student[2]);

        // Студенты
        Student student4 = new Student( "Дмитрий","Group2");
        Student student5 = new Student("Филлип", "Group2");

        // Добавляем студентов в массив группы
        group2.getStudentsForGroup()[0] = student4;
        group2.getStudentsForGroup()[1] = student5;

        // Вывод
        System.out.println(group2);
    }
}
