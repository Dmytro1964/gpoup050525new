package JavaBasic.Proba.Cycles;

public class CycleA {
    public static void main(String[] args) {

        String[]words4 = {"Сметана", "Сахар", "Сливки", "Молоко", "Пиво"};
        int countA = 0;

        for( int i = 0; i < words4.length; i ++){
            if( words4[i].toLowerCase().contains("а")){
                System.out.println( " Слово содержит букву а " + words4[i]);
                countA ++;
            }
        }
        System.out.println( "\n Количество слов содержащих букву а : " + countA);
    }
}
