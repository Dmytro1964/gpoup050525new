package JavaBasic.Test.Test06;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class Numbers1 {

    public static void main(String[] args) {

        int number = UserInputStatic.nextInt( " Выедите число 1, 2 илм 3");

        switch (number){
            case 1 : System.out.println(" Вы ввели число 1");
            break;
            case 2 : System.out.println(" Вы ввели число 2");
            break;
            case 3: System.out.println(" Вы ввели число 3");
            break;
            default: System.out.println( " Вы ввели неправильное число ");
        }

    }
}
