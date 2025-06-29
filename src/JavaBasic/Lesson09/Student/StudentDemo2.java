package JavaBasic.Lesson09.Student;

public class StudentDemo2 {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student student1 = service.createNewStudent();
        Student student2 = service.createNewStudent();
        Student student3 = service.createNewStudent();

    }
}
