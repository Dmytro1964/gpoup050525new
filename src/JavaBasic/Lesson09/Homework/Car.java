package JavaBasic.Lesson09.Homework;

public class Car {

    private String model;
    private CarMaker carMaker;
    private String color;

    public Car(String model, CarMaker carMaker, String color) {
        this.model = model;
        this.carMaker = carMaker;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public CarMaker getCarMaker() {
        return carMaker;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", carMaker=" + carMaker +
                ", color='" + color + '\'' +
                '}';
    }
}



