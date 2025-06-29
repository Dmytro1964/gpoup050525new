package JavaBasic.Lesson03.Homework;

public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        double length = 34.9;
        double width = 76.5;

        double area = rectangle.calculateArea(length,width);
        double perimeter = rectangle.calculatePerimeter(length,width);

        System.out.println( " Площадь прямоугольника : " + area + " sm²  ") ;
        System.out.println( " Периметр прямоугольника : " + perimeter + " sm  ");
    }
}
