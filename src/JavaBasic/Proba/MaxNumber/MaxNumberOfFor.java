package JavaBasic.Proba.MaxNumber;

public class MaxNumberOfFor {
    public static void main(String[] args) {
        // Создаем четыре случайных числа

        int numberA = (int)(Math.random()*101);
        int numberB;
        do { numberB = (int)(Math.random()*101);
        }
        while ( numberA == numberB);

        int numberC;
        do { numberC =(int)(Math.random()*101);}
        while ( numberC == numberA || numberC == numberA);

        int numberD;
        do { numberD = ( int) ( Math.random()*101);
        }
        while (numberD == numberA || numberD == numberB || numberD == numberC);



        // Выводим их на экран
        System.out.println(numberA);
        System.out.println(numberB);
        System.out.println(numberC);
        System.out.println(numberD);

        int max1 = Math.max(numberA,numberB);
        int max2 = Math.max(numberC,numberD);
        int max = Math.max(max1,max2);

        System.out.println( "Наибольшее число : " + max);
        }



        }






