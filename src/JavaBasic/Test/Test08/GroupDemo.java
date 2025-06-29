package JavaBasic.Test.Test08;

public class GroupDemo {
    public static void main(String[] args) {
        Student[]students = new Student[2];

        Group group1 = new Group("Biologi", students);

        Student student1 = new Student("Sergey", "Biologi");
        Student student2 = new Student("Olga", "Biologi");

        students[0] = student1;
        students[1]= student2;

        System.out.println(group1);
    }
}
