package Lesson16.Students;

public class StudentDemo {
    public static void main(String[] args) {
        // Создаём массив имён студентов
        String[] students = {"Александр", "Любовь", "Андрей", "Алена", "Дмитрий", "Виктор"};

        int countA = 0;

        System.out.println("Список студентов:");
        for (String name : students) {
            System.out.println(name);

            // Проверка, начинается ли имя на "А"
            if (name.startsWith("А")) {
                countA++;
            }
        }

        System.out.println(" Количество студентов, имя которых начинается на 'А': " + countA);
    }
}
