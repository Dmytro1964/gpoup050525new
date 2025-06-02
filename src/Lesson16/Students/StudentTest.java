package Lesson16.Students;

public class StudentTest {
    public static void main(String[] args) {

        // Создание массива студентов
        Student[] students = {
                new Student("Александр"),
                new Student("Любовь"),
                new Student("Андрей"),
                new Student("Аленаа"),
                new Student("Дмитрий"),
                new Student("Виктор")
        };

        int countA = 0;

        System.out.println("Список студентов:");
        for (Student student : students) {
            System.out.println(student.getName());

            // Проверка, начинается ли имя на "А"
            if (student.getName().startsWith("А")) {
                countA++;
            }
        }

        System.out.println(" Количество студентов, имя которых начинается на 'А': " + countA);
    }
}