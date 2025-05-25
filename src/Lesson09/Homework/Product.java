package Lesson09.Homework;

public class Product {

    private String name;
    private Category category;
    private double price;
    private int quantity;

    public Product(String name, Category category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name ='" + name + '\'' +
                ", category =" + category.getName() +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
