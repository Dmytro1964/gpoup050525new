package JavaBasic.Lesson22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarCatalogServiceTest {

    @Test
    void addCar() {
        CarCatalogService catalog = new CarCatalogService(2);

        // Добавляем первую машину
        boolean added1 = catalog.addCar(new Car("A1", "Toyota", 32000));
        assertTrue(added1);

        // Добавляем вторую машину
        boolean added2 = catalog.addCar(new Car("B2", "Honda", 35000));
        assertTrue(added2);
    }

    @Test
    void findByNumber() {
        CarCatalogService catalog = new CarCatalogService(3);
        catalog.addCar(new Car("A1", "Toyota", 32000));
        catalog.addCar(new Car("B2", "Honda", 35000));

        Car found = catalog.findByNumber("B2");
        assertNotNull(found);
        assertEquals("Honda", found.getBrand());

        Car notFound = catalog.findByNumber(" r777r");
        assertNull(notFound);

    }

    @Test
    void findByBrand() {
        CarCatalogService catalog = new CarCatalogService(4);
        catalog.addCar(new Car("A1", "Toyota", 32000));
        catalog.addCar(new Car("B2", "Honda", 35000));

        Car[] toyota = catalog.findByBrand("Toyota");
        assertEquals(1, toyota.length);
    }

    @Test
    void findByPriceRange() {
        CarCatalogService catalog = new CarCatalogService(4);
        catalog.addCar(new Car("A1", "Toyota", 32000));
        catalog.addCar(new Car("B2", "Honda", 35000));

        Car[] carsInRange = catalog.findByPriceRange(10000, 40000);
        assertEquals(2, carsInRange.length);

        Car[] cheapCars = catalog.findByPriceRange(8000, 10000);
        assertEquals(0, cheapCars.length);
        Car[] expensiveCars = catalog.findByPriceRange(34000, 40000);
        assertEquals(1, expensiveCars.length);
    }
}
