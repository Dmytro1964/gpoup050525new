package JavaBasic.Proba.lesson09;

import JavaBasic.Lesson09.Homework.Category;

public class Product {
    private String name;
    private Category category;
    private double Price;
    private int Quantity;

    public Product(String name, Category category, double price, int quantity) {
        this.name = name;
        this.category = category;
        Price = price;
        Quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", Price=" + Price +
                ", Quantity=" + Quantity +
                '}';
    }
}
