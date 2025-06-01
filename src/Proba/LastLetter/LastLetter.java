package Proba.LastLetter;

import java.util.Scanner;

public class LastLetter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово ");
        String word = scanner.nextLine();
        if(word.length() > 1 && word.endsWith("ь")){
            System.out.println( "Результат : " + word.charAt(word.length()-2));
        }
        else if (word.length() >0){
            System.out.println("Результат : " + word.charAt(word.length() -1));

        }
        else {System.out.println(" Поле пустое");}


    }
}