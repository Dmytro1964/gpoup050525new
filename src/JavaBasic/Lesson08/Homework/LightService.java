package JavaBasic.Lesson08.Homework;

import java.util.Scanner;

public class LightService {

    public void lightStatus(Light light) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Включить свет? (true/false): ");
        boolean newStatus = scanner.nextBoolean();
        light.setOn(newStatus);
        System.out.println("Новый статус света: " + newStatus);

    }

    public void ChangeBrightness(Light light){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите новую яркость (0–100):");
        int newBrightness = scanner.nextInt();

        light.setBrightness(newBrightness);

        System.out.println( " Новая яркость  : " + light.getBrightness());


    }
    public void printStatus(Light light){System.out.println(light);}



}
