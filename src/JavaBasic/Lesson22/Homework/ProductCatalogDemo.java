package JavaBasic.Lesson22.Homework;

public class ProductCatalogDemo {
    public static void main(String[] args) {
        // Создаем каталог на 10 товаров
        // Создаем каталог на 10 товаров
        ProductCatalog catalog = new ProductCatalog(10);
        ProductService service = new ProductService(catalog);

        // Добавляем товары
        service.addProduct(new Product(1, "Молоко", "Простоквашино"));
        service.addProduct(new Product(2, "Хлеб", "Хлебозавод"));
        service.addProduct(new Product(3, "Кефир", "Простоквашино"));

        // Поиск по ID
        Product found = service.findById(2);
        if (found != null) {
            System.out.println("Найден товар по ID: " + found);
        } else {
            System.out.println("Товар не найден по ID.");
        }

        // Поиск по производителю
        System.out.println("\nТовары от производителя 'Простоквашино':");
        service.findByManufacturer("Простоквашино");

        // Поиск по наименованию
        System.out.println("\nТовары с наименованием 'Хлеб':");
        service.findByName("Хлеб");

        // Поиск по наименованию и производителю
        System.out.println("\nТовары с наименованием 'Кефир' и производителем 'Простоквашино':");
        service.findByNameAndManufacturer("Кефир", "Простоквашино");
    }
}


