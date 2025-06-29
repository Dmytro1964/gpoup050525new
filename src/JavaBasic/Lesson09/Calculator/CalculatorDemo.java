package JavaBasic.Lesson09.Calculator;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double sumResult = calculator.sum(67,76);

        System.out.println("Сумма равна :" + sumResult);
    }
}
