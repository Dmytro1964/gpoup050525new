package JavaBasic.Test.Test03;

import java.util.Scanner;

public class Phone {    private String model;
    private String color;
    private boolean isSilent;

    // Конструктор
    public Phone(String model, String color, boolean isSilent) {
        this.model = model;
        this.color = color;
        this.isSilent = isSilent;
    }

    // Метод изменения режима "без звука"
    public void changeSilentMode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Включить режим без звука? (да / нет):");
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("да")) {
            isSilent = true;
        } else if (answer.equals("нет")) {
            isSilent = false;
        } else {
            System.out.println("Ошибка: нужно ввести 'да' или 'нет'");
            return;
        }

        System.out.println("Текущий режим: " + (isSilent ? "без звука ВКЛЮЧЁН" : "звук ВКЛЮЧЁН"));
    }

    // Метод toString — для вывода телефона
    @Override
    public String toString() {
        return "Телефон: модель = " + model +
                ", цвет = " + color +
                ", режим без звука = " + (isSilent ? "включён" : "выключен");
    }
}