package JavaBasic.Test.Test02;

public class Temperature {

    private double celsius;
    private  double fahrenheit;

    public Temperature(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = toFarenheit();

    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = toFarenheit();
    }

    public double toFarenheit(){
        double fahrenheit = celsius * 9/5 + 32;
        return fahrenheit;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "celsius=" + celsius +
                ", fahrenheit=" + fahrenheit +
                '}';
    }
}
