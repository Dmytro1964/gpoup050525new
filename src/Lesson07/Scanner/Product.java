package Lesson07.Scanner;

public class Product {

    private String producer;
    private String model;
    private double price;

    public Product(String producer, String productName, double price) {
        this.producer = producer;
        this.model = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "producer='" + producer + '\'' +
                ", productName='" + model + '\'' +
                ", price=" + price +
                '}';
    }

}
