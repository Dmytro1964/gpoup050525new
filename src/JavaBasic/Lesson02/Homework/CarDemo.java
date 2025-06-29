package JavaBasic.Lesson02.Homework;

public class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", " Prado", 2017, 68000);
        Car car2 = new Car("Toyota", "Corolla", 2023, 23456);

        car1.PrintInfo();
        car2.PrintInfo();
        
    };
}
