package Lesson22.Homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProductCatalogDemoTest {


    @Test
    public void testAddProductAndFindById() {
        ProductCatalog catalog = new ProductCatalog(3);
        ProductService service = new ProductService(catalog);

        Product p1 = new Product(1, "Молоко", "Простоквашино");
        Product p2 = new Product(2, "Хлеб", "Хлебозавод");

        service.addProduct(p1);
        service.addProduct(p2);

        Product found = service.findById(2);
        assertNotNull(found);
        assertEquals("Хлеб", found.getName());
    }

    @Test
    public void testFindByManufacturer() {
        ProductCatalog catalog = new ProductCatalog(5);
        ProductService service = new ProductService(catalog);

        service.addProduct(new Product(1, "Молоко", "Простоквашино"));
        service.addProduct(new Product(2, "Кефир", "Простоквашино"));
        service.addProduct(new Product(3, "Хлеб", "Хлебозавод"));


        assertEquals(3, catalog.getSize());
    }

    @Test
    public void testFindByNameAndManufacturer() {
        ProductCatalog catalog = new ProductCatalog(4);
        ProductService service = new ProductService(catalog);

        service.addProduct(new Product(1, "Кефир", "Простоквашино"));
        service.addProduct(new Product(2, "Кефир", "Другой завод"));


        assertEquals(2, catalog.getSize());


    }
}