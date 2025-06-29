package JavaBasic.Proba.TestCycleFor;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class TestForTwo {
    public static void main(String[] args) {
        int sum = 0;

        int n = UserInputStatic.nextInt(" Введите целое число n от 0 до 20 ");

                for(int i =1; i <= n ; i++){
                    if( i % 2 ==0 && i % 4 == 0){
                        sum += i;
                        System.out.println("Сумма всех чётных чисел, делящихся на 4: " + sum);
                    }

                }
    }
}
