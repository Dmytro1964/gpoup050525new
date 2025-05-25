package Lesson08.Homework.aufgabe1.var01;

public class Light {

    private String location;
    private int brightness;
    private boolean isOn;

    public Light(String location, int brightness, boolean isOn) {
        this.location = location;
        this.brightness = Math.max(0,Math.min(100,brightness));
        this.isOn = isOn;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = Math.max(0,Math.min(100,brightness));
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public String toString() {
        return " Освещение  : {" +
                " Гостиная : ='" + location + '\'' +
                ", Яркость : =" + brightness +
                ", Свет включен ? : =" + isOn +
                '}';
    }
}
