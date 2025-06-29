package JavaBasic.Proba.StringExample;

import java.util.Scanner;

public class StringCharExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите строку : ");
        String input = scanner.nextLine();
        if (!input.isEmpty()){
            char LastChar = input.charAt(input.length()-1);
            System.out.println("Последний символ : " + LastChar);

        }
        else {System.out.println(" Вы ввели пустую строку");}

    }
}
