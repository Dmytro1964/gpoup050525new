package JavaBasic.Lesson07.Homework.Exercise02;

public class CarDemo {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Prado", 15.0, 80.0);


        System.out.println(car);

        car.setFuelConsumption(12);

        System.out.println(" Рассчет максимальной дистанции после изменения расхода топлива : ");

        System.out.println(car);








    }
}
