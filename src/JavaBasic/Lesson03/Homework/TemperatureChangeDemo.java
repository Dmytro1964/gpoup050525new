package JavaBasic.Lesson03.Homework;

public class TemperatureChangeDemo {

    public static void main(String[] args) {

        TemperatureChange temperatureChange = new TemperatureChange();

        double celsius = 180;
       double fahrenheit = temperatureChange.toFahrenheit(celsius);

       System.out.println( "Температура в градусах Цельсия " + celsius);
        System.out.println( "Температура в градусах Фаренгейта " + fahrenheit);



    }
}
