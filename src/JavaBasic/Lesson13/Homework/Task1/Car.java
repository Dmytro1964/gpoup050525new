package JavaBasic.Lesson13.Homework.Task1;

public class Car {

    private String producer;
    private String model;
    private int power;


    public Car(String producer, String model, int power) {
        this.producer = producer;
        this.model = model;
        this.power = power;}

    public void printCarInfo() {
        System.out.println("Car{" +
                "producer = " + producer +
                ", model = " + model +
                ", power = " + power +
                "}");

    }
}


