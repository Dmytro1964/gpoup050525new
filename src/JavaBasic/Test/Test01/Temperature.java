package JavaBasic.Test.Test01;

public class Temperature {
    public static void main(String[] args) {

        int[]temperatures = {15,16,16,17,18,19,21};
        int sum = 0;
        for (int temp : temperatures){
             sum = sum + temp;}
        double averageTemperature = (double) sum/ temperatures.length;

        System.out.println( " Средняя температура : " + averageTemperature);


        }
    }

