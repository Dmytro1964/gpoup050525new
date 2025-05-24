package Lesson08.Var02;

import java.util.Scanner;

public class Student {

    private String studentName;
    private String group;
    private String status;

    public Student(String studentName, String group, String status) {
        this.studentName = studentName;
        this.group = group;
        this.status = status;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getGroup() {
        return group;
    }

    public String getStatus() {
        return status;
    }

    public void ChangeStatus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новый статус студента");

        status = scanner.nextLine();


        scanner.close();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", group='" + group + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
