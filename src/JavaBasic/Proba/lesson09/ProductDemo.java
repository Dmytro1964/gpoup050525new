package JavaBasic.Proba.lesson09;

import JavaBasic.Lesson09.Homework.Category;

public class ProductDemo {
    public static void main(String[] args) {

        Category electronics = new Category(" Электроника", " Магнитофоны и телефоны");
        Category clothe = new Category( " Одежда ", " Куртки и пальто ");

        Product product1 = new Product("Магнитофон", electronics, 550, 19);
        Product product2 = new Product("Куртка", clothe,150, 34);
        Product product3 = new Product("Телефон", electronics,650, 54);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);





    }
}
