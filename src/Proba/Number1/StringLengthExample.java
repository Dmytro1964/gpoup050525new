package Proba.Number1;

import java.util.Scanner;

public class StringLengthExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Введите строку : ");
        String text = scanner.nextLine();
        int length = text.length();
        System.out.println( " Длина строки :" + length);


    }
}
