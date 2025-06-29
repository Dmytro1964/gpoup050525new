package JavaBasic.Lesson18.Proba;

public class Purchase {
    public static void main(String[] args) {

        int productCoast1 = 1000;
        int productCoast2 = 500;
        int discount = 100;
        int total = productCoast1 + productCoast2;
        int completely = total - discount;

        System.out.println( " Cтоимость покупки : " + total);
        System.out.println("---------------------------------");
        System.out.println(" Cкидка : " + discount);
        System.out.println("---------------------------------");
        System.out.println(" Финальная стоимость покупки : " + completely);
        System.out.println("---------------------------------");


    }
}
