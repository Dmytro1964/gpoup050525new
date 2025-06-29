package JavaBasic.Proba.Test;

public class Rectangle {

    private double length;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void calculateArea (){
        area = length * width;
    }
    public void calculatePerimeter(){
        perimeter = 2*(length+width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
