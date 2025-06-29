package JavaBasic.Test.Test06;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class Numbers {
    public static void main(String[] args) {

        int number = UserInputStatic.nextInt( " Введите число 1, 2 или 3");

        if (number == 1){System.out.println(" Вы ввели число" + number);}
        else if (number ==2){System.out.println("Вы ввели число " + number);}
        else if (number==3){ System.out.println(" Вы ввели число " + number);}
        else {System.out.println(" Вы ввели неправильное число ");}

    }
}
