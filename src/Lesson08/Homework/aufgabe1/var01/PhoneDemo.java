package Lesson08.Homework.aufgabe1.var01;

import java.util.Scanner;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone1 = new Phone("Nokia 70A","grey",false);
        System.out.println(phone1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Включить режим без звука? ");
        boolean changeStatus = scanner.nextBoolean();
        phone1.setSilent(changeStatus);

        System.out.println("Статус телефона после изменения режима звука");
        System.out.println(phone1);



    }


}
