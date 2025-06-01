package Lesson02.Homework;

public class Car {

    String carBrand;
    String carModel;
    int carYear;
    int carMileage;

    public Car(String carBrand, String carModel, int carYear, int carMileage) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carMileage = carMileage;
    }
    public void PrintInfo(){
        System.out.println( " Производитель автомобиля : " + carBrand);
        System.out.println( " Модель автомобиля : " + carModel);
        System.out.println(" Год выпуска : " + carYear);
        System.out.println(" Пробег автомобиля : " + carMileage);
        System.out.println("-----------------------------------------------------");


    }
}
