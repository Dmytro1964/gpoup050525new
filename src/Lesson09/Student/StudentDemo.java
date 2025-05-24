package Lesson09.Student;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя студента");
        String studentName1 = scanner.nextLine();

        System.out.println("Введите фамилию студента");
        String studentLastname1 = scanner.nextLine();

        System.out.println("Введите ID card студента");
        String idCard1 = scanner.nextLine();

        System.out.println(" Введите группу студента");
        String group1 = scanner.nextLine();

        Student student1 = new Student(studentName1,studentLastname1,idCard1,group1);
        System.out.println(student1);








    }
}
