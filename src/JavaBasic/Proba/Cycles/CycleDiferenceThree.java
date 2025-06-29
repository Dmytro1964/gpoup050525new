package JavaBasic.Proba.Cycles;

public class CycleDiferenceThree {
    public static void main(String[] args) {

        int count = 0;

        System.out.println( "Все числа с разностью 3 : ");

        for (int i = 10; i <= 99; i ++){
            int diff = Math.abs ((i/10)-(i%10));
            if(diff == 3){
                System.out.print( i + ",");
                count++;
            }
        }
        System.out.println( " Количество чисол : " + count);
    }
}
