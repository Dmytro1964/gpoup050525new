package Lesson09.Homework;

public class CarMaker {

    private String name;
    private String country;

    public CarMaker(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Производитель: " + name + ", Страна: " + country;
    }
}

