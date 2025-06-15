package Lesson22.Homework;

public class ProductCatalog {
    private Product[] products;
    private int size;

    // Конструктор: принимает максимальное количество товаров в каталоге
    public ProductCatalog(int capacity) {
        this.products = new Product[capacity]; // создаём массив заданной длины
        this.size = 0; // пока товаров нет
    }

    // Геттер для массива товаров
    public Product[] getProducts() {
        return products;
    }

    // Геттер для количества добавленных товаров
    public int getSize() {
        return size;
    }

    // Метод увеличивает счётчик добавленных товаров
    public void incrementSize() {
        size++;
    }
}




