package JavaBasic.Test.Test07;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class Catalog {
    public static void main(String[] args) {


        int count = UserInputStatic.nextInt(" Какое количество автомобилей создать ?");

        Car[]cars = new  Car[count];

        for(int i = 0; i < count; i ++){

            System.out.println(" Выедите данные автомобиля N " +(i+1));

            String producer = UserInputStatic.nextString("Производитель : ");
            String model = UserInputStatic.nextString(" Модель ;");
            int power = UserInputStatic.nextInt( " Мощкость :");

            cars[i] = new Car(producer,model,power);

        }
        System.out.println(" Каталог автомобилей : ");

        for (int i = 0; i < cars.length; i++){

            System.out.println(cars[i]);
        }

    }
}
