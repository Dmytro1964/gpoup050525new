package Lesson07.Homework.Exercise01;

public class Employee {

    private String name;
    private int hoursWorked;
    private double hourlyRate;
    private double monthlySalary;

    // Конструктор
    public Employee(String name, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.monthlySalary = calculateMonthlySalary();
    }

    // Метод пересчёта зарплаты
     private double calculateMonthlySalary() {
        return hoursWorked * hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
        this.monthlySalary = calculateMonthlySalary();

    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
        this.monthlySalary = calculateMonthlySalary();
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Работник {" +
                "Имя :  ='" + name + '\'' +
                ", Отработано часов :  = " + hoursWorked +
                ", Ставка :  =" + hourlyRate +
                ", Месячная зарплата=" + monthlySalary +
                '}';
    }
}


