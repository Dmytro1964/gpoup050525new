package JavaBasic.Proba.TestDivaideThree;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class TestDivideSeven {
    public static void main(String[] args) {
        int n = UserInputStatic.nextInt("Введите число N: ");
        int countSeven = 0;

        for ( int i = 0; i <= n; i++){
            int num =i;
            boolean hasSeven = false;
            int digit = 0;
            while (num>0){
                digit = num % 10;
                if(digit==7){
                    hasSeven = true;
                    break;
                }
                else num = num/10;
            }
            if (hasSeven){
                countSeven ++;
            }

        }
        System.out.println(" Все числа с 7 : " + countSeven);

    }
    }

