package JavaBasic.Test.Test05;

public class Auto {

    private String model;
    private Maker maker;
    private String color;

    public Auto(String model, Maker maker, String color) {
        this.model = model;
        this.maker = maker;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Maker getMaker() {
        return maker;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", maker=" + maker +
                ", color='" + color + '\'' +
                '}';
    }
}
