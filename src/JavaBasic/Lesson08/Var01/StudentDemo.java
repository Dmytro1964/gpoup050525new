package JavaBasic.Lesson08.Var01;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {

        Student student1 = new Student("Ruslan","123654","Зачислен");
        System.out.println(student1);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите новый статус студента");
        String newStatus = scanner.nextLine();
        student1.setStatus(newStatus);

        System.out.println(" Данные студента после обновления");
        System.out.println(student1);

    }
}
