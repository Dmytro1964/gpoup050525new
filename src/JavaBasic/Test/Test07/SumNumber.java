package JavaBasic.Test.Test07;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class SumNumber {
    public static void main(String[] args) {

        int n = UserInputStatic.nextInt(" Введите простое число");

        int sum = 0;

        for(int i = 0; i<=n; i++){
            if( i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(" Сумма всех четных чисол от 0 до " + n + " равна " + sum);
    }
}
