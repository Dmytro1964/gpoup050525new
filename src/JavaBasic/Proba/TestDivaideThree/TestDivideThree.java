package JavaBasic.Proba.TestDivaideThree;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class TestDivideThree {
    public static void main(String[] args) {

        int n = UserInputStatic.nextInt(" Введите число N ");
        int count = 0;

        for (int i = 1; i <= n; i ++){
            int num = i;
            int digitSum = 0;
            while (num > 0){
                digitSum = digitSum + num % 10;
                num = num/10;
            }
            if (digitSum % 3 == 0){
                count ++;

            }

        }
        System.out.println(" Количоство чисел : " + count);

    }
}
