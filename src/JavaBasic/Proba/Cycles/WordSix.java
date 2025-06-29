package JavaBasic.Proba.Cycles;

public class WordSix {
    public static void main(String[] args) {

        String[] words = {"человек", "носорог", "кот", "рыба", "ёж"};

        for (int i = 0; i < words.length; i++) {
            if ( words[i].length() >= 6) {
                System.out.println(" Слово " + words[i]+ " одержит 6 букв ");
            } else {
                System.out.println(" Слово " + words[i]+ " содержит не 6 букв ");
            }
        }
    }
}