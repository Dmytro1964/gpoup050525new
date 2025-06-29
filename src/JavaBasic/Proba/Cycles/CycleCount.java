package JavaBasic.Proba.Cycles;

public class CycleCount {
    public static void main(String[] args) {

        String[]words2 = {"чемодан", "сумка", "баул", "коробка", "саквояж"};
        int count = 0;

        for (int i = 0; i< words2.length; i++){
            if (words2[i].length()> 6){
                count ++;
                System.out.println("Слово длиннее 6 букв : " + words2[i]);
            }

        }
        System.out.println( " Количество слов длиннее 6 букв = " + count);
    }
}
