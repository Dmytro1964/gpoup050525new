package JavaBasic.Test.Test02;

public class Rectangle {

    private double sizeA;
    private double sizeB;
    private double area;
    private double perimeter;

    public Rectangle(double sizeA, double sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public double getSizeA() {
        return sizeA;
    }

    public double getSizeB() {
        return sizeB;
    }

    public double getArea() {
        return area ;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setSizeA(double sizeA) {
        this.sizeA = sizeA;
    }

    public void setSizeB(double sizeB) {
        this.sizeB = sizeB;
    }

    public double calculateArea(){
        double area = sizeA * sizeB;
        return area;
    }
    public  double calculatePerimeter(){
        double perimeter = 2*(sizeA + sizeB);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sizeA=" + sizeA +
                ", sizeB=" + sizeB +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
