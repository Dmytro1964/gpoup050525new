package JavaBasic.Proba.Cycles;

public class CycleMultTwelve {
    public static void main(String[] args) {
        int count = 0;
        System.out.println(" Все числа с произведением 12 : ");
        for(int i =  10; i<= 99; i++){
            int mult = Math.abs((i/10)*(i%10));
            if (mult == 12 ){
                System.out.print(i + ",");
                count++;
            }

            }
        System.out.print( "\n Количестао чисел с произведением 12 : " + count);
        }
    }

