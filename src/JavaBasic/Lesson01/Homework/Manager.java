package JavaBasic.Lesson01.Homework;

public class Manager {
    public static void main(String[] args) {
        // Создаем первого менеджера
        Manager manager1 = new Manager();
        int ageManager1 = 37;
        double salaryManager1 = 5000;

        // Выводим информацию о первом менеджере
        System.out.println( " Manager 1");
        System.out.println( " Возраст первого менеджера: "  + ageManager1);
        System.out.println(" Зарплата первого менеджера : " + salaryManager1);

        // Менеджер1 отметил день рождения
        ageManager1 = ageManager1 +1;
        System.out.println( " Manager 1 после Дня Рождения ");
        System.out.println( " Возраст первого менеджера: "  + ageManager1);
        System.out.println(" Зарплата первого менеджера : " + salaryManager1);

        // Создаем второго менеджера
        Manager manager2 = new Manager();
        int ageManager2 = 49;
        double salaryManager2 = 7000;
        // Выводим информацию о втором менеджере
        System.out.println( " Manager 2");
        System.out.println( " Возраст второго менеджера: "  + ageManager2);
        System.out.println(" Зарплата второго менеджера : " + salaryManager2);

        // Менеджер2 отметил день рождения
        ageManager2 = ageManager2 +1;
        System.out.println( " Manager 2 после Дня Рождения ");
        System.out.println( " Возраст первого менеджера: "  + ageManager2);
        System.out.println(" Зарплата первого менеджера : " + salaryManager2);









    }
}
