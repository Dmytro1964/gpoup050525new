package JavaBasic.Test.Test05.Pizza;

public class Pizza {
    public static void main(String[] args) {

        int smallPizzaDiameter = 24;
        int bigPizzaDiameter = 28;

        double differencePizzaArea = getDifferenceArea(smallPizzaDiameter,bigPizzaDiameter);
        double differencePizzaCalories = getDifferenceCalories(differencePizzaArea);

        System.out.println(differencePizzaArea);
        System.out.println(differencePizzaCalories);
    }
    public static double getDifferenceArea(int small, int big){
        double smallArea = Math.PI * small* small/4;
        double bigArea = Math.PI*big*big/4;
        return bigArea - smallArea;
    }
    public static double getDifferenceCalories( double differenceArea){
        return differenceArea *40;
    }
}
