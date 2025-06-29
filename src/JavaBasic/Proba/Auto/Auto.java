package JavaBasic.Proba.Auto;

public class Auto {
    private String model;
    private Brand brand;
    private String color;

    public Auto(String model, Brand brand, String color) {
        this.model = model;
        this.brand = brand;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto: " + model + " | Brand: " + brand + " | Color: " + color;
    }
}
