package JavaBasic.Lesson22;

public class CarCatalogDemo {
    public static void main(String[] args) {        CarCatalogService catalog = new CarCatalogService(10); // вместимость 10 автомобилей

        catalog.addCar(new Car("A1", "Toyota", 32000));
        catalog.addCar(new Car("B2", "Honda", 35000));

        Car found = catalog.findByNumber("B2");
        if (found != null) {
            System.out.println("Нашли машину: " + found);
        }

        Car[] toyota = catalog.findByBrand("Toyota");
        System.out.println("Найдено Toyota: " + toyota.length);

        Car[] priceRangeCars = catalog.findByPriceRange(10000, 40000);
        System.out.println("Машин в диапазоне цены: " + priceRangeCars.length);
    }
}



