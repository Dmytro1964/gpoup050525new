package BackEndKurs.Lesson01.HomeWork.Shape;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Абстрактный метод — должен быть реализован в подклассах
    public abstract double getArea();

    // Общий метод (не абстрактный)
    public void displayInfo() {
        System.out.println("Фигура: " + name + ", Площадь: " + getArea());
    }
}