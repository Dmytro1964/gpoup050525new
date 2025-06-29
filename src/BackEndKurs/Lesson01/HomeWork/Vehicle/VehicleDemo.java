package BackEndKurs.Lesson01.HomeWork.Vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 4);
        Bicycle bike = new Bicycle("Trek", "FX 3", 2022, true);

        System.out.println("=== Автомобиль ===");
        car.displayInfo();
        car.start();
        car.honk();
        car.stop();

        System.out.println("\n=== Велосипед ===");
        bike.displayInfo();
        bike.start();
        bike.ringBell();
        bike.stop();
    }
}


