package JavaBasic.Proba.NumberFinder;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class FindNumber {
    public static void main(String[] args) {
         int number = UserInputStatic.nextInt( " Введите число 1, 2 или 3 ");

         if( number == 1) {
             System.out.println(" Вы ввели число 1 ");
         }
         else if ( number == 2){
             System.out.println( " Вы ввели число 2");
        }
         else if ( number == 3){
             System.out.println(" Вы ввели число 3");
         }
         else {System.out.println(" Вы ввели неправильное чимло ");}
    }
}
