package Lesson08.Var03;

import java.util.Scanner;

public class StudentService {

    public void ChangeStatus(Student student){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вклюсить режим без звкка?");
        String newStatus = scanner.nextLine();
        student.setStatus(newStatus);
        scanner.close();

    }
}
