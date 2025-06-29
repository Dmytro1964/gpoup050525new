package JavaBasic.Proba.Cycles;

public class ForLetters {
    public static void main(String[] args) {

        String[] words1 = {"чемлдан", "сумка", "баул", "коробка", "саквояж"};

        for (int i = 0; i < words1.length; i++) {

            if (words1[i].length() == 4) {
                System.out.println(" Слово содержит 4 буквы = " + words1[i]);
            }
        }
    }
}