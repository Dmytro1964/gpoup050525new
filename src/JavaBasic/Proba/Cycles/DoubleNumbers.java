package JavaBasic.Proba.Cycles;

public class DoubleNumbers {
    public static void main(String[] args) {

        int count = 0;
        System.out.println( "Все чимла с суммой 10 : " );
        for (int i = 10; i <= 99; i++){
            int sum = (i/10) + (i%10);
            if(sum == 10){
                System.out.print(i+ ",");
                count ++;
            }



        }
        System.out.println( "\n Количество таких чисел : " + count);

    }
}
