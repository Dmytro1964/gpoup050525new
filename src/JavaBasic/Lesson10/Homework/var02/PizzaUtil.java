package JavaBasic.Lesson10.Homework.var02;

public class PizzaUtil {

    public double calculateCalories(double diameter, double caloriesInOne){

        double radius = diameter/2;

        double pizzaArea = 3.1415 * radius * radius;

        double calories = pizzaArea * caloriesInOne;

        return calories;



    }
}
