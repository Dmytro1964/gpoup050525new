package JavaBasic.Lesson22.Homework;

public class Product {

    private int id;
    private String name;
    private String manufacturer;

    public Product(int id, String name, String manufacturer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    // Метод toString() — для красивого вывода
    @Override
    public String toString() {
        return "ID: " + id + ", Название: " + name + ", Производитель: " + manufacturer;
    }
}
