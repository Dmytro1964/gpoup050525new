package JavaBasic.Lesson11.staticExample;

public class MyMathDemo {
    public static void main(String[] args) {

        // раньше мы должны были постуать так :
        // MyMath mymath = new MyMath();
         //int result = MyMath.sum(10,5);
        // теперь используя static мы можем не создавать объект mymath, a вызвать метод сразу.

      System.out.println("Сумма 10 и 5 = " + MyMath.sum(10,5));


      int radius = 3;
      double circleArea = Math.PI * radius * radius;

      System.out.println(" Площадь круга с радиусом : " + radius +  " будет равна : " + circleArea);

      System.out.println(" Наибольшее чимло из 67 и 95 будет : " + Math.max(67,95));




    }
}
