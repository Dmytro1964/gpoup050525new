package JavaBasic.Proba.Cycles;

public class CycleTwoThree {
    public static void main(String[] args) {

        int count = 0;// счетчик подходящих чисел
        int sum = 0;// подсчет суммы

        for (int i = 0; i <= 30; i++)
        {
            if (i % 3 == 0 && i% 2 != 0){
                System.out.println(" Числа которые делятся на 3 и не делятся на 2 : " + i);
                count ++;
                sum += i;
            }

        }
        System.out.println(" Количество этих чисел : " + count);
        System.out.println(" Сумма этих чисел : " + sum);
    }

}