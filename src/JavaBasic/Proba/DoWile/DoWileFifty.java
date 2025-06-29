package JavaBasic.Proba.DoWile;

public class DoWileFifty {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;

        do{
            if (i % 4 == 0){
                sum += i;
            }
            i += 2;}
        while (i<=50);
        System.out.println("Сумма всех чётных чисел до 50, делящихся на 4: " + sum);

        }
    }

