package JavaBasic.Test.Test01;

public class Manager {
    public static void main(String[] args) {
        Manager manager1 = new Manager();
        int managerFirstAge = 45;
        int managerFirstSalary = 5600;

        System.out.println( "Возраст первого менеджера : " + managerFirstAge );
        System.out.println( "Зерплате первого менеджера : " + managerFirstSalary );


        System.out.println( " Первый менеджер отпраздновал свой день рождения ");

        managerFirstAge = managerFirstAge +1;
        managerFirstSalary = managerFirstSalary + 400;

        System.out.println( " Возраст первого менеджера после Дня рождения : " + managerFirstAge);

        System.out.println( "Зерплате первого менеджера после Дня рождения  : " + managerFirstSalary );


    }
}
