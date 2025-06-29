package JavaBasic.Test.Test08;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {

        int[] numbers = new int[12];
        Random random = new Random();

        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = random.nextInt(50)+1;
        }
        System.out.println( " Исходный массив : ");
        for(int num : numbers){
            System.out.print(num + " ");
        }
        System.out.println();

        for(int i = 0; i< numbers.length; i++){
            if(i%2 != 0){
                numbers[i]=0;
            }
        }
        System.out.println( " Заключиткльный массив : ");
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }

}
