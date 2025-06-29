package BackEndKurs.Lesson01.HomeWork.Vehicle;
public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year); // теперь работает правильно!
        this.numberOfDoors = numberOfDoors;
    }

    public void honk() {
        System.out.println("Автомобиль сигналит: Би-бип!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // вызываем метод родителя Vehicle
        System.out.println("Количество дверей: " + numberOfDoors);
    }
}

