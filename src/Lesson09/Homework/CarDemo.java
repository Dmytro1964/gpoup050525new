package Lesson09.Homework;

import java.util.concurrent.Callable;

public class CarDemo {
    public static void main(String[] args) {

        CarMaker Toyota = new CarMaker("Toyota", "Japan");
       CarMaker Honda = new CarMaker("Honda", "Japan");

        Car car1 = new Car("Prado",Toyota,"wait" );
        Car car2 = new Car("Corola",Toyota, "wait");
        Car car3 = new Car("Accord",Honda,"black");




        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);






    }
}
