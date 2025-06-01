package Lesson14.Homework.Task2;

public class Greeter {
    // Метод greet выводит приветствие указанное количество раз
    public void greet(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, " + name + "!");
        }
}
}
