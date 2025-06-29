package JavaBasic.Test.Test02;

public class PriceCalculator {
    public static void main(String[] args) {

        double priceA = 1000;
        double priceB = 500;
        double discount = 100;
        double totalPrice = getTotalPrice(priceA,priceB,discount);

        System.out.println(" Цена товара со скидкой : " + totalPrice);
    }

    public static double getTotalPrice(double priceA, double priceB, double discount){
        double sum = priceA + priceB;
        double total = sum - discount;
        return total;
    }
}
