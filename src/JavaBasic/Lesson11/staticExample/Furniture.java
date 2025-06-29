package JavaBasic.Lesson11.staticExample;

public class Furniture {
    public static void main(String[] args) {

        Chair chair1 = new Chair(1,"M1");
        Chair chair2 = new Chair(2,"M2");
        Chair chair3 = new Chair(3,"M1");

        System.out.println(Chair.chairCounter);


    }
}
