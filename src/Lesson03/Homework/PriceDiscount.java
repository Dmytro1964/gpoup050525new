package Lesson03.Homework;

public class PriceDiscount {

    public static void main(String[] args) {

        double PriceA = 1000;
        double PriceB = 500;
        double Discount = 100;

        double TotalPrice = getTotalPrice(PriceA,PriceB,Discount);

        System.out.println( " Итоговая сумма покупки : " + TotalPrice + " € ");
        System.out.println(" Скидка " + Discount);
    }

       public static double getTotalPrice(double PriceA, double PriceB, double Discount){
        return (PriceA + PriceB) - Discount;




       }
}
