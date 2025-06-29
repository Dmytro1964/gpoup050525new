package BackEndKurs.Lesson01.HomeWork.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("Треугольник");
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
