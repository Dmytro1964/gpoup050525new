package JavaBasic.Test.Test04;

public class ToFharenheit {

    private double celcius;
    private double fahrenheit;

    public ToFharenheit() {
        this.celcius = 0;
        this.fahrenheit = 0;
    }

    public double getCelcius() {
        return celcius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    @Override
    public String toString() {
        return "ToFharenheit{" +
                "celcius=" + celcius +
                ", fahrenheit=" + fahrenheit +
                '}';
    }

    public void toFahrenheit (){
        double fahrenheit = celcius * 9/5 +32;

    }
}
