package Lesson10.Pizza.var01;

public class Pizza {
    public static void main(String[] args) {

        double pizzaSmall = 24;
        double pizzaBig = 28;
        double caloriesInOne = 40;

        double countPizzaSmall = caloriesInOne * 3.1415 * pizzaSmall * pizzaSmall / 4;
        double countPizzaBig = caloriesInOne * 3.1415 * pizzaBig * pizzaBig/ 4;

        System.out.println("Разница в каллориях : " + (countPizzaBig - countPizzaSmall));




    }
}
