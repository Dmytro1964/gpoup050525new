package Lesson01.Homework;

public class Discount {
    public static void main(String[] args) {

        int price1 = 1000;
        int price2 = 500;
        int discount = 100;

        int total = price1 + price2;
        int finalPrice = total - discount;

        System.out.println( "Общая сумма покупки : " + total);
        System.out.println(" Скидка : " + discount);
        System.out.println(" Сумма покупки со скидкой ; " + finalPrice);
    }
}
