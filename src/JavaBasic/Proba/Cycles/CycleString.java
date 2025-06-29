package JavaBasic.Proba.Cycles;

public class CycleString {
    public static void main(String[] args) {

        String[] fruits = {"яблрко","дыня","апельсин","персик"};
        for( int i = 0 ; i < fruits.length; i ++){
            System.out.println("Фрукт N " + (i+1) + " : "+ fruits[i] + " Длинна : " + fruits[i].length());
        }

    }
}
