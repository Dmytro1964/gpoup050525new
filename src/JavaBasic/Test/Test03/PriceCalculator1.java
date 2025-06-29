package JavaBasic.Test.Test03;

public class PriceCalculator1 {
    public static void main(String[] args) {

        int priceA = 1000;
        int priceB = 500;
        int discount = 100;
        int sum = getSum(priceA,priceB);
        int total = getTotalPrice(priceA,priceB,discount);

        System.out.println("Сумма покупки без скидки    : " + sum );
        System.out.println( " Скидка составляет : " + discount);
        System.out.println( " Сумма с учетом скидки : " + total);
    }
    public static int getSum (int priceA, int priceB){
        int sum = priceA + priceB;
        return sum;

    }

    public static int getTotalPrice( int priceA, int priceB, int discount){
        int sum = priceA + priceB;
        int total = sum - discount;
        return total;
    }


}
