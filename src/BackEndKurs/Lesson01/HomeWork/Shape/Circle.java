package BackEndKurs.Lesson01.HomeWork.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Круг");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
