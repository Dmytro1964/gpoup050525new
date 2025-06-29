package JavaBasic.Test.Test07;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class NumberOddQuantity {
    public static void main(String[] args) {

       int n = UserInputStatic.nextInt("Введите число");
       int eventCount = 0;
       int oddCount = 0;

       for(int i = 0; i <=n; i++){
           if (i%2 ==0){
               eventCount = eventCount + 1;
           }
           else {oddCount = oddCount +1;}
       }
       System.out.println("Количество всех четных чисел :" + eventCount);
        System.out.println("Количество всех нечетных чисел :" + oddCount);
    }
}
