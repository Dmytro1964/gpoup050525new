package Lesson24.Homework.Student;

import Lesson17.Homework.UserInputStatic;

public class StudentService {
    // Создаем массив студентов нужной длины
    public Student[] createStudentsArrayFromUserInput() {
        int size = UserInputStatic.nextInt("Введите количество студентов: ");
        return new Student[size];
    }

    // Заполняем массив студентов
    public void fillStudentsArrayFromUserInput(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Введите данные для студента №" + (i + 1));
            students[i] = createStudentFromUserInput();
        }
    }

    // Создаем одного студента
    public Student createStudentFromUserInput() {
        String lastName = UserInputStatic.nextString("Фамилия: ");
        String firstName = UserInputStatic.nextString("Имя: ");
        int age = UserInputStatic.nextInt("Возраст: ");
        return new Student(lastName, firstName, age);
    }

    // Сортируем студентов по фамилии
    public void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getLastName().compareToIgnoreCase(students[j].getLastName()) > 0) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    // Печать всех студентов
    public void printStudents(Student[] students) {
        System.out.println("\nСписок студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

