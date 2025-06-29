package JavaBasic.Proba.NumberFinder;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class NumberFinder {
    public static void main(String[] args) {

        int number1 = UserInputStatic.nextInt( " Введите число 1,2, или 3");

        switch ( number1){
            case 1:
                System.out.println( " Вы ввели число 1");
                break;
            case 2:
                System.out.println( " Вы ввели число 2");
                break;
            case 3:
                System.out.println( " Вы ввели число 3");
                break;
            default:
                System.out.println(" Вы ввели неправильное число");
                break;


        }
    }
}
