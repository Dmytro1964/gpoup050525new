package Lesson02.Homework.Temperature02;

public class Temperature2 {

    double celsius;
    double fahrenheit;

    public Temperature2(double celsius) {
        this.celsius = celsius;
    }
    public void toFahrenheit(){

         fahrenheit = celsius * 9/5 +32;
         System.out.println(" Температура в градусах Цельсия : " + celsius + "°С");
         System.out.println(" Температура в градусах Фаренгейта : " + fahrenheit + "°F");

    }
}

