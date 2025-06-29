package JavaBasic.Proba.CalculatePizzaCalories;

public class PizzaCalories {
    public static void main(String[] args) {

        int smallDiameter = 24;
        int grossDiameter = 28;

        double smallCalories = calculCal(smallDiameter);
        double grossCalories = calculCal (grossDiameter);
        double overCalories = grossCalories - smallCalories;

        System.out.println("SMKAL" + smallCalories);
        System.out.println("GRKAL" + grossCalories);
        System.out.println( "OVERKAL" + overCalories);
    }
    public static double calculCal(int diameter){
        double radius = diameter / 2;
        double area = radius * radius * Math.PI;
        return area * 40;

    }

}
