package JavaBasic.Test.Test02;

public class TemperatureDemo {
    public static void main(String[] args) {

        Temperature temperature1 = new Temperature(35.0);
        System.out.println(temperature1);

        temperature1.setCelsius(75);
        System.out.println(temperature1);

    }
}

