package Lesson01.Homework;

import java.util.SimpleTimeZone;

public class AverageTemperature {
    public static void main(String[] args) {



    int TempDay1 = 14;
    int TempDay2 = 13;
    int TempDay3 = 14;
    int TempDay4 = 15;
    int TempDay5 = 16;
    int TempDay6 = 17;
    int TempDay7 = 18;

    int sumTemp = TempDay1 + TempDay2 + TempDay3 + TempDay4 + TempDay5 + TempDay6 + TempDay7;

    double averageTemp = sumTemp / 7.0;

    System.out.println( " Средняя температура за неделю  : " + averageTemp +  "°C");



}


}
