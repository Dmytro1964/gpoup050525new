package JavaBasic.Lesson22.Homework;

public class ProductService {
    private ProductCatalog catalog;

    // Конструктор
    public ProductService(ProductCatalog catalog) {
        this.catalog = catalog;
    }

    // Добавление нового товара
    public void addProduct(Product product) {
        if (catalog.getSize() < catalog.getProducts().length) {
            catalog.getProducts()[catalog.getSize()] = product;
            catalog.incrementSize();
        } else {
            System.out.println("Каталог заполнен, нельзя добавить больше товаров.");
        }
    }

    // Поиск по номеру (id)
    public Product findById(int id) {
        for (int i = 0; i < catalog.getSize(); i++) {
            if (catalog.getProducts()[i].getId() == id) {
                return catalog.getProducts()[i];
            }
        }
        return null;
    }

    // Поиск по производителю
    public void findByManufacturer(String manufacturer) {
        boolean found = false;
        for (int i = 0; i < catalog.getSize(); i++) {
            if (catalog.getProducts()[i].getManufacturer().equalsIgnoreCase(manufacturer)) {
                System.out.println(catalog.getProducts()[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Товары с таким производителем не найдены.");
    }

    // Поиск по названию
    public void findByName(String name) {
        boolean found = false;
        for (int i = 0; i < catalog.getSize(); i++) {
            if (catalog.getProducts()[i].getName().equalsIgnoreCase(name)) {
                System.out.println(catalog.getProducts()[i]);
                found = true;
            }
        }
        if (!found) System.out.println("Товары с таким названием не найдены.");
    }

    // Поиск по названию и производителю
    public void findByNameAndManufacturer(String name, String manufacturer) {
        boolean found = false;
        for (int i = 0; i < catalog.getSize(); i++) {
            Product p = catalog.getProducts()[i];
            if (p.getName().equalsIgnoreCase(name) &&
                    p.getManufacturer().equalsIgnoreCase(manufacturer)) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) System.out.println("Товары с такими параметрами не найдены.");
    }
}