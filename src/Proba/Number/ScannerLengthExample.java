package Proba.Number;

import java.util.Scanner;

public class ScannerLengthExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введие строку :  ");
        String input = scanner.nextLine();
        int length = input.length();
        System.out.println("  Длина строки " + length);

    }
}
