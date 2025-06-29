package JavaBasic.Proba.Discount;

public class Discount {
    public static void main(String[] args) {

        int goods1 = 1000;
        int goods2 = 500;
        int discount = 100;

        int total = goods1 + goods2;
        int finalPraise = total - discount;

        System.out.println(" Сумма покупки  :  " + total);
        System.out.println(" Скидка  :  " + discount);
        System.out.println(" Окончательная сумма покупки  :  " + finalPraise);



    }
}
