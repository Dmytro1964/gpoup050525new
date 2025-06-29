package JavaBasic.Test.Test04;

public class PriceCalculator {
    public static void main(String[] args) {

        int priceA = 1000;
        int priceB = 500;
        int discount = 100;
        int totalSum = totalSumCalculate(priceA,priceB);
        int finalSum = finalSumCalculate(totalSum,discount);

        System.out.println(" Общая сумма покупки : " + totalSum);
        System.out.println(" Суммв скидки : "+ discount);
        System.out.println( " Сумма покупки с учетои скидки : " + finalSum);

    }
    public static int totalSumCalculate(int priceA , int priceB){
        int totalSum = priceA + priceB;
        return totalSum;
    }
    public static  int finalSumCalculate(int totalSum, int discount){
        int finalSum = totalSum - discount;
        return finalSum;
    }
}
