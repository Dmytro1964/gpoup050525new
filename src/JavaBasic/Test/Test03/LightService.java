package JavaBasic.Test.Test03;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class LightService {
    // Метод включает или выключает свет в зависимости от ответа
    public void changeLightState(Light light) {
        String answer = UserInputStatic.nextString("Включить свет в " + light.getLocation() + "? (да / нет):");

        if (answer.equals("да")) {
            light.setOn(true);
        } else if (answer.equals("нет")) {
            light.setOn(false);
        } else {
            System.out.println("Ошибка: введите 'да' или 'нет'");
            return;
        }

        System.out.println("Свет " + (light.isOn() ? "включён." : "выключен."));
    }

    // Метод запрашивает у пользователя и устанавливает яркость
    public void changeBrightness(Light light) {
        int inputBrightness = UserInputStatic.nextInt("Введите желаемую яркость (от 0 до 100):");

        if (inputBrightness < 0 || inputBrightness > 100) {
            System.out.println("Некорректное значение яркости.");
            return;
        }

        light.setBrightness(inputBrightness);
        System.out.println("Яркость установлена на: " + light.getBrightness());
    }
}