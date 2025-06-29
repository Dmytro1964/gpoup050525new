package JavaBasic.Proba.Number;

import java.util.Scanner;

public class LastCharExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Введите строку : ");
        String text = scanner.nextLine();
        int length = text.length();
        char LastChar = text.charAt( length -1);
        System.out.println( " Последнмй символ : " + LastChar);

    }
}
