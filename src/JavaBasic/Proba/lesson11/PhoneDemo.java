package JavaBasic.Proba.lesson11;

import java.util.Scanner;

public class PhoneDemo {
    public static void main(String[] args) {

        Phone phone = new Phone("Nokia","black", false);
        System.out.println(phone);
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Режим без звука включить ? true / false ");
        Boolean changeStatus = scanner.nextBoolean();
        System.out.println( "Режим телефона после изменения статуса : ");
        phone.setSilent(changeStatus);
        System.out.println(phone);
    }
}
