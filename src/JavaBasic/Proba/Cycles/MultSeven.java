package JavaBasic.Proba.Cycles;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class MultSeven {
    public static void main(String[] args) {

        int number = UserInputStatic.nextInt(" Введите любое число : ");
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x "+ i+ " = " + number*i);


        }

    }
}
