package JavaBasic.Test.Test06;

public class Car {

    private String producer; // производитель (например, BMW)
    private String model;    // модель (например, X5)
    private int power;       // мощность (например, 245 л.с.)

    // Конструктор — вызывается при создании объекта
    public Car(String producer, String model, int power) {
        this.producer = producer;
        this.model = model;
        this.power = power;
    }

    // Метод для вывода информации о машине
    public void printCarInfo() {
        System.out.println("Car{producer='" + producer +
                "', model='" + model +
                "', power=" + power + "}");
    }
}

