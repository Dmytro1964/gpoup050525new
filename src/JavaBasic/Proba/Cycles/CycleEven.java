package JavaBasic.Proba.Cycles;

public class CycleEven {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i ++){
            if(i % 2==0){
                System.out.println(i + " Число  четное");
            }
            else System.out.println(i + " Число нечетное");
        }
    }
}
