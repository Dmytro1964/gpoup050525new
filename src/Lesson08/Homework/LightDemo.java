package Lesson08.Homework;

public class LightDemo {
    public static void main(String[] args) {
        Light light = new Light("Гостиная",70, true);
        LightService lightService = new LightService();


        lightService.printStatus(light);
        lightService.lightStatus(light);
        lightService.ChangeBrightness(light);
        lightService.printStatus(light);





    }
}
