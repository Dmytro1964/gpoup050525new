package JavaBasic.Test.Test01;

public class Discount {
    public static void main(String[] args) {

        int goodA = 1000;
        int goodB = 500;
        int discount = 100;
        int total = goodA + goodB;
        int finalPrise = total - discount;
        System.out.println(" Сумма покупки без скидки : " + total);
        System.out.println("------------------------------------------");
        System.out.println(" Скидка : " + discount);
        System.out.println("------------------------------------------");
        System.out.println(" Сумма покупки со скидкой : " + finalPrise);
    }
}
