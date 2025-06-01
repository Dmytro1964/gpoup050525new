package Proba.Number;

import java.util.Scanner;

public class FirstLetterCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите первое слово");
        String word1 = scanner.nextLine();
        System.out.println( " Введите второе слово");
        String word2 = scanner.nextLine();

        if(word1.charAt(0) == word2.charAt(0)){
            System.out.println( " Первые буквы совпадают");
        }
        else {System.out.println(" Первые буквы не совпадают");}






    }
}
