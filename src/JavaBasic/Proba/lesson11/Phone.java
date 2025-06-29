package JavaBasic.Proba.lesson11;

public class Phone {
    String model;
    String color;
    Boolean isSilent;

    public Phone(String model, String color, Boolean isSilent) {
        this.model = model;
        this.color = color;
        this.isSilent = isSilent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getSilent() {
        return isSilent;
    }

    public void setSilent(Boolean silent) {
        isSilent = silent;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", isSilent=" + isSilent +
                '}';
    }
}
