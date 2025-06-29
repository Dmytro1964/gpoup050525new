package JavaBasic.Lesson24.Homework.Student;

public class Student {
    private String lastName;
    private String firstName;
    private int age;

    public Student(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + ", возраст: " + age;
    }
}

