package JavaBasic.Lesson08.Homework;

public class Phone {

    private String model;
    private String color;
    private boolean isSilent;

    public Phone(String model, String color, boolean isSilent) {
        this.model = model;
        this.color = color;
        this.isSilent = isSilent;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isSilent() {
        return isSilent;
    }

    public void setSilent(boolean silent) {
        isSilent = silent;
    }

    @Override
    public String toString() {
        return "Телефон {" +
                "Модель : ='" + model + '\'' +
                ", Цвет : ='" + color + '\'' +
                ", Выключен ? =" + isSilent +
                '}';
    }
}
