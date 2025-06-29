package JavaBasic.Lesson09.Student;

public class Student {

    private String FirstName;
    private String LastName;
    private String studentCardNumber;
    private String group;

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", studentCardNumber='" + studentCardNumber + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public Student(String firstName, String lastName, String studentCardNumber, String group) {
        FirstName = firstName;
        LastName = lastName;
        this.studentCardNumber = studentCardNumber;
        this.group = group;

    }
}
