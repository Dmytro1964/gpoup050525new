package JavaBasic.Proba.Cycles;

public class CycleEvenDouble {
    public static void main(String[] args) {

        int count = 0;
        System.out.println( "Числа с  четной суммой  " );
        for (int i = 10; i<= 99; i++){
            int summ = Math.abs( (i/10) +(i%10));
                if( summ %2 == 0 ){
                    System.out.print(i + ",");
                    count++;

                }
            }
        System.out.println("\n --------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println( "\n  Количество чисел с четной суммой : " + count);
        }
    }

