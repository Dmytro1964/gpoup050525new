package Lesson08.Var02;

public class StudentDemo {
    public static void main(String[] args) {

        Student student1 = new Student("Ruslan", "654312"," зачислен");
        System.out.println(student1);

        student1.ChangeStatus();


        System.out.println(" Данные студента помле обновления");
        System.out.println(student1);
    }
}
