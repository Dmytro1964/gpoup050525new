package JavaBasic.Lesson07.Homework.Exercise02;

public class Car {

    private String brand;
    private String model;
    private double fuelConsumption;
    private double fuelTankCapacity;
    private double maxDistance;


    public Car(String brand, String model, double fuelConsumption, double fuelTankCapacity) {
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.fuelTankCapacity = fuelTankCapacity;
        this.maxDistance = calculateMaxDistance();


    }
        private double calculateMaxDistance() {
            return 100/ fuelConsumption * fuelTankCapacity;


}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        this.maxDistance = calculateMaxDistance(); // Пересчёт

    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
        this.maxDistance = calculateMaxDistance(); // Пересчёт
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public String toString() {
        return "Автомобиль : {" +
                "Производитель ='" + brand + '\'' +
                ", Марка автомобиля : ='" + model + '\'' +
                ", Расход топлива :  = " + fuelConsumption +
                ", Объем бака  : =" + fuelTankCapacity +
                ", Максимальная дистанция : =" + maxDistance +
                '}';
    }
}
