package JavaBasic.Proba.Test;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", 200, 12);

        System.out.println(employee1);

        // Изменим количество часов
        employee1.setHoursWorked(190);
        System.out.println(employee1);

        employee1.setHourlyRate(15);
        System.out.println(employee1);
    }
}
