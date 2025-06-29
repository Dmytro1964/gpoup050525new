package JavaBasic.Lesson18.Proba;

public class Manager {
    public static void main(String[] args) {
         // Срздаем первого менеджера
        Manager manager1 = new Manager();
        int manager1Age = 45;
        double manager1Salary = 4000;
        // Выводим информацию о первом пользователе

        System.out.println(" Менеджер 1 " );
        System.out.println( " Возраст менеджер 1 ; " + manager1Age);
        System.out.println( " Зарплата менеджер 1 " + manager1Salary );
        System.out.println("--------------------------------------------");
        System.out.println( " Менеджер 1 отметил день рождения ");
        System.out.println( "---------------------------------------------");
        manager1Age = manager1Age +1;
        manager1Salary = manager1Salary + 1000;
        System.out.println(" Возраст менеджера 1 : "+ manager1Age);
        System.out.println("Зарплата менеджер 1 " + manager1Salary);




    }
}