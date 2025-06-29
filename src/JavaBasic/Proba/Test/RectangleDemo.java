package JavaBasic.Proba.Test;

public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(45.8, 76.9);
        Rectangle rectangle2 = new Rectangle(34.8,77.6);

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();

        System.out.println(rectangle1);
        System.out.println(rectangle2);

    }
}
