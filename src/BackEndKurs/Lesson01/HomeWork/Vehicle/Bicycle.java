package BackEndKurs.Lesson01.HomeWork.Vehicle;

public class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(String brand, String model, int year, boolean hasBell) {
        super(brand, model, year);
        this.hasBell = hasBell;
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println("Звонок велосипеда: Динь-динь!");
        } else {
            System.out.println("У этого велосипеда нет звонка.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Наличие звонка: " + (hasBell ? "Да" : "Нет"));
    }
}
