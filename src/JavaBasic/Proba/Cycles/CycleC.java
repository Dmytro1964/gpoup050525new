package JavaBasic.Proba.Cycles;

public class CycleC {
    public static void main(String[] args) {
        String[] words3 = {"Сметана", "Сахар", "Сливки", "Молоко", "Пиво"};
        int count = 0;
        int count2= 0;

        for (int i = 0; i < words3.length; i++) {
            if (words3[i].startsWith("С")) {
                System.out.println(" Слово начинается с буквы С : " + words3[i]);
                count ++;
            }
            else {
                System.out.println(" Слово не начинается с буквы С : " + words3[i]);
                count2 ++;

            }

        }
        System.out.println( "\n Количество слов начинающихся на С : " + count);
        System.out.println( "\n Количество слов неначинающихся на С : " +count2);
    }
}