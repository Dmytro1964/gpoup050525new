package JavaBasic.Lesson24.Homework.Student;

public class StudentsSortDemo {
    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student[] students = service.createStudentsArrayFromUserInput();

        service.fillStudentsArrayFromUserInput(students);

        service.sortStudents(students);

        service.printStudents(students);
    }
}


