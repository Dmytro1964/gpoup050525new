package Lesson09.Student;

import java.util.Scanner;

public class StudentService {

    public Student createNewStudent(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя студента");
        String studentName = scanner.nextLine();

        System.out.println("Введите фамилию студента");
        String studentLastname = scanner.nextLine();

        System.out.println("Введите ID card студента");
        String idCard = scanner.nextLine();

        System.out.println(" Введите группу студента");
        String group = scanner.nextLine();

        Student student = new Student(studentName,studentLastname,idCard,group);
        System.out.println(student);
        return student;
    }
}
