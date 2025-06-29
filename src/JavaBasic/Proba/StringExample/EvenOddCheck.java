package JavaBasic.Proba.StringExample;

import java.util.Scanner;

public class EvenOddCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число");
        int number = scanner.nextInt();
        if (number % 2 == 0){ System.out.println( "число   "  + number + "   четное");}

        else {System.out.println(" число   "  +  number  + "   нечетное");}


    }
}
