package Lesson09.Homework;

import java.util.concurrent.Callable;

public class ProductDemo {
    public static void main(String[] args)

    {// Создаем категории
Category electronics = new Category( " Электроника", " Компьютеры и смартфоны");
Category clothing = new Category("Одежда", "Все для детей");


     // Создаем товары

        Product notebook = new Product("Asus S18k",electronics, 1600.0, 5);
        Product smartphone = new Product("Samsung", electronics,650.0, 25);
        Product cap = new Product("Шапка", clothing, 18.0, 10);

        // Выводим информацию
        System.out.println(notebook);
        System.out.println(smartphone);
        System.out.println(cap);
    }











}
