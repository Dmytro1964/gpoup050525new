package Lesson10.Homework.var02;

public class Pizza2 {
    public static void main(String[] args) {

        PizzaUtil pizzaUtil = new PizzaUtil();

        double countCaloriesPizzaSmall = pizzaUtil.calculateCalories(24,40);
        double countCaloriesPizzaBig = pizzaUtil.calculateCalories(28,40);

        System.out.println("Разница в каллориях : " + (countCaloriesPizzaBig - countCaloriesPizzaSmall));


    }
}
