package JavaBasic.Lesson11.Homework.Exercise01;

public class Pizza {
    public static void main(String[] args) {
        int diameterSmall = 24;
        int diameterLarge = 28;

        double caloriesSmall = calculateCalories(diameterSmall);
        double caloriesLarge = calculateCalories(diameterLarge);

        double extraCalories = caloriesLarge - caloriesSmall;

        System.out.println("Калории в пицце 24 см: " + caloriesSmall);
        System.out.println("Калории в пицце 28 см: " + caloriesLarge);
        System.out.println("Лишние калории: " + extraCalories);
    }

    public static double calculateCalories(int diameter) {
        double radius = diameter / 2.0;
        double area = Math.PI * radius * radius;
        return area * 40;
    }
}
