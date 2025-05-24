package Lesson08.Var03;

public class StudentDemo {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        Student student1 = new Student("Ruslan", "321654","зачислен");
        System.out.println(student1);

        service.ChangeStatus(student1);

        System.out.println("Статус мтудента после изменения");
        System.out.println(student1);
    }
}
