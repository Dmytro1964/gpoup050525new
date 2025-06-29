package JavaBasic.Proba.Test;

public class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car( "Toyota", " Prado", 15.0, 80.0);

        car1.calculateMaxDistance();
        System.out.println(car1);

        car1.setFuelConsumption(9.0);
        car1.calculateMaxDistance();
        System.out.println(car1);

    }
}
